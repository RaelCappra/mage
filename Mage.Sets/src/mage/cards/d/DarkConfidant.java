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
package mage.cards.d;

import java.util.UUID;
import mage.MageInt;
import mage.abilities.Ability;
import mage.abilities.common.BeginningOfUpkeepTriggeredAbility;
import mage.abilities.effects.OneShotEffect;
import mage.cards.*;
import mage.constants.CardType;
import mage.constants.Outcome;
import mage.constants.SubType;
import mage.constants.TargetController;
import mage.constants.Zone;
import mage.game.Game;
import mage.game.permanent.Permanent;
import mage.players.Player;

/**
 *
 * @author Loki
 */
public class DarkConfidant extends CardImpl {

    public DarkConfidant(UUID ownerId, CardSetInfo setInfo) {
        super(ownerId, setInfo, new CardType[]{CardType.CREATURE}, "{1}{B}");
        this.subtype.add(SubType.HUMAN);
        this.subtype.add(SubType.WIZARD);

        this.power = new MageInt(2);
        this.toughness = new MageInt(1);

        // At the beginning of your upkeep, reveal the top card of your library and put that card into your hand. You lose life equal to its converted mana cost.
        this.addAbility(new BeginningOfUpkeepTriggeredAbility(new DarkConfidantEffect(), TargetController.YOU, false));
    }

    public DarkConfidant(final DarkConfidant card) {
        super(card);
    }

    @Override
    public DarkConfidant copy() {
        return new DarkConfidant(this);
    }
}

class DarkConfidantEffect extends OneShotEffect {

    DarkConfidantEffect() {
        super(Outcome.DrawCard);
        this.staticText = "reveal the top card of your library and put that card into your hand. You lose life equal to its converted mana cost";
    }

    DarkConfidantEffect(final DarkConfidantEffect effect) {
        super(effect);
    }

    @Override
    public boolean apply(Game game, Ability source) {
        Player controller = game.getPlayer(source.getControllerId());
        Permanent sourcePermanent = game.getPermanentOrLKIBattlefield(source.getSourceId());
        if (controller != null && sourcePermanent != null) {
            if (controller.getLibrary().hasCards()) {
                Card card = controller.getLibrary().getFromTop(game);
                if (card != null) {
                    Cards cards = new CardsImpl(card);
                    controller.revealCards(sourcePermanent.getIdName(), cards, game);
                    controller.moveCards(card, Zone.HAND, source, game);
                    controller.loseLife(card.getConvertedManaCost(), game, false);

                }
                return true;
            }
        }
        return false;
    }

    @Override
    public DarkConfidantEffect copy() {
        return new DarkConfidantEffect(this);
    }
}
