/*
 *  Copyright 2010 BetaSteward_at_googlemail.com. All rights reserved.
 *
 *  Redistribution and use in source and binary forms, with or without modification, are
 *  permitted provided that the following conditions are met:
 *
 *     1. Redistributions of source code must retain the above copyright notice, this list of
 *        conditions and the following disclaimer.
 *
 *     2. Redistributions in binary form must reproduce the above copyright notice, this list
 *        of conditions and the following disclaimer in the documentation and/or other materials
 *        provided with the distribution.
 *
 *  THIS SOFTWARE IS PROVIDED BY BetaSteward_at_googlemail.com ``AS IS'' AND ANY EXPRESS OR IMPLIED
 *  WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND
 *  FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL BetaSteward_at_googlemail.com OR
 *  CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 *  CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR
 *  SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON
 *  ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 *  NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF
 *  ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 *
 *  The views and conclusions contained in the software and documentation are those of the
 *  authors and should not be interpreted as representing official policies, either expressed
 *  or implied, of BetaSteward_at_googlemail.com.
 */
package mage.cards.c;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.EndOfCombatTriggeredAbility;
import mage.abilities.common.EntersBattlefieldAbility;
import mage.abilities.common.SimpleEvasionAbility;
import mage.abilities.condition.common.AttackedOrBlockedThisCombatSourceCondition;
import mage.abilities.condition.common.IsStepCondition;
import mage.abilities.costs.common.TapSourceCost;
import mage.abilities.costs.mana.ManaCostsImpl;
import mage.abilities.decorator.ConditionalActivatedAbility;
import mage.abilities.decorator.ConditionalTriggeredAbility;
import mage.abilities.dynamicvalue.DynamicValue;
import mage.abilities.dynamicvalue.common.ManacostVariableValue;
import mage.abilities.effects.common.combat.CantBeBlockedByCreaturesSourceEffect;
import mage.abilities.effects.common.counter.AddCountersSourceEffect;
import mage.abilities.effects.common.counter.RemoveCounterSourceEffect;
import mage.cards.CardImpl;
import mage.cards.CardSetInfo;
import mage.constants.CardType;
import mage.constants.SubType;
import mage.constants.Duration;
import mage.constants.PhaseStep;
import mage.constants.Zone;
import mage.counters.Counter;
import mage.counters.CounterType;
import mage.counters.Counters;
import mage.filter.common.FilterCreaturePermanent;
import mage.filter.predicate.mageobject.CardTypePredicate;
import mage.game.Game;
import mage.watchers.common.AttackedOrBlockedThisCombatWatcher;

/**
 *
 * @author escplan9, MarcoMarin & L_J
 */
public class ClockworkSteed extends CardImpl {

    private static final FilterCreaturePermanent filter = new FilterCreaturePermanent("artifact creatures");

    static {
        filter.add(new CardTypePredicate(CardType.ARTIFACT));
    }

    public ClockworkSteed(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.ARTIFACT, CardType.CREATURE}, "{4}");
        this.subtype.add(SubType.HORSE);
        this.power = new MageInt(0);
        this.toughness = new MageInt(3);

        // Clockwork Steed enters the battlefield with four +1/+0 counters on it.
        this.addAbility(new EntersBattlefieldAbility(new AddCountersSourceEffect(CounterType.P1P0.createInstance(4)), "with four +1/+0 counters on it"));

        // Clockwork Steed can't be blocked by artifact creatures.
        this.addAbility(new SimpleEvasionAbility(new CantBeBlockedByCreaturesSourceEffect(filter, Duration.WhileOnBattlefield)));

        // At end of combat, if Clockwork Steed attacked or blocked this combat, remove a +1/+0 counter from it.
        this.addAbility(new ConditionalTriggeredAbility(
                new EndOfCombatTriggeredAbility(new RemoveCounterSourceEffect(CounterType.P1P0.createInstance()), false),
                AttackedOrBlockedThisCombatSourceCondition.instance,
                "At end of combat, if {this} attacked or blocked this combat, remove a +1/+0 counter from it."),
                new AttackedOrBlockedThisCombatWatcher()
        );

        // {X}, {tap}: Put up to X +1/+0 counters on Clockwork Steed. This ability can't cause the total number of +1/+0 counters on Clockwork Steed to be greater than four. Activate this ability only during your upkeep.
        Ability ability = new ConditionalActivatedAbility(
                Zone.BATTLEFIELD,
                new ClockworkSteedAddCountersSourceEffect(
                        CounterType.P1P0.createInstance(),
                        new ManacostVariableValue(),
                        true, true
                ),
                new ManaCostsImpl("{X}"),
                new IsStepCondition(PhaseStep.UPKEEP),
                null
        );
        ability.addCost(new TapSourceCost());
        this.addAbility(ability);
    }

    public ClockworkSteed(final ClockworkSteed card) {
        super(card);
    }

    @Override
    public ClockworkSteed copy() {
        return new ClockworkSteed(this);
    }
}

class ClockworkSteedAddCountersSourceEffect extends AddCountersSourceEffect {

    public ClockworkSteedAddCountersSourceEffect(Counter counter, DynamicValue amount, boolean informPlayers, boolean putOnCard) {
        super(counter, amount, informPlayers, putOnCard);
        staticText = "Put up to X +1/+0 counters on {this}. This ability can't cause the total number of +1/+0 counters on {this} to be greater than four.";
    }

    @Override
    public boolean apply(Game game, Ability source) {
        //record how many counters
        Counters permCounters = game.getPermanent(source.getSourceId()).getCounters(game);
        int countersWas = permCounters.getCount(CounterType.P1P0);
        if (countersWas < 4) {
            super.apply(game, source);
            if (permCounters.getCount(CounterType.P1P0) > 4) {
                permCounters.removeCounter(CounterType.P1P0, permCounters.getCount(CounterType.P1P0) - 4);
            }//if countersWas < 4 then counter is min(current,4); there is no setCounters function tho
        }//else this is a rare case of a Steed getting boosted by outside sources :) Which is the sole purpose of this if, for the benefit of this rare but not impossible case :p
        return true;
    }
}
