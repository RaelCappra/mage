package mage.sets;

import mage.cards.ExpansionSet;
import mage.constants.Rarity;
import mage.constants.SetType;

/**
 * @author TheElk801
 */
public final class DominariaUnitedCommander extends ExpansionSet {

    private static final DominariaUnitedCommander instance = new DominariaUnitedCommander();

    public static DominariaUnitedCommander getInstance() {
        return instance;
    }

    private DominariaUnitedCommander() {
        super("Dominaria United Commander", "DMC", ExpansionSet.buildDate(2022, 11, 9), SetType.SUPPLEMENTAL);
        this.hasBasicLands = false;

        cards.add(new SetCardInfo("Abundant Growth", 128, Rarity.COMMON, mage.cards.a.AbundantGrowth.class));
        cards.add(new SetCardInfo("Abzan Charm", 138, Rarity.UNCOMMON, mage.cards.a.AbzanCharm.class));
        cards.add(new SetCardInfo("Adriana, Captain of the Guard", 139, Rarity.RARE, mage.cards.a.AdrianaCaptainOfTheGuard.class));
        cards.add(new SetCardInfo("Alesha, Who Smiles at Death", 118, Rarity.RARE, mage.cards.a.AleshaWhoSmilesAtDeath.class));
        cards.add(new SetCardInfo("Ambition's Cost", 110, Rarity.UNCOMMON, mage.cards.a.AmbitionsCost.class));
        cards.add(new SetCardInfo("Anafenza, Kin-Tree Spirit", 97, Rarity.RARE, mage.cards.a.AnafenzaKinTreeSpirit.class));
        cards.add(new SetCardInfo("Arcane Sanctum", 196, Rarity.UNCOMMON, mage.cards.a.ArcaneSanctum.class));
        cards.add(new SetCardInfo("Arcane Signet", 177, Rarity.COMMON, mage.cards.a.ArcaneSignet.class));
        cards.add(new SetCardInfo("Archelos, Lagoon Mystic", 140, Rarity.RARE, mage.cards.a.ArchelosLagoonMystic.class));
        cards.add(new SetCardInfo("Arvad the Cursed", 141, Rarity.UNCOMMON, mage.cards.a.ArvadTheCursed.class));
        cards.add(new SetCardInfo("Ashling the Pilgrim", 119, Rarity.RARE, mage.cards.a.AshlingThePilgrim.class));
        cards.add(new SetCardInfo("Atla Palani, Nest Tender", 142, Rarity.RARE, mage.cards.a.AtlaPalaniNestTender.class));
        cards.add(new SetCardInfo("Bad River", 197, Rarity.UNCOMMON, mage.cards.b.BadRiver.class));
        cards.add(new SetCardInfo("Baleful Strix", 143, Rarity.RARE, mage.cards.b.BalefulStrix.class));
        cards.add(new SetCardInfo("Baru, Wurmspeaker", 26, Rarity.RARE, mage.cards.b.BaruWurmspeaker.class));
        cards.add(new SetCardInfo("Battlefield Forge", 198, Rarity.RARE, mage.cards.b.BattlefieldForge.class));
        cards.add(new SetCardInfo("Beast Within", 129, Rarity.UNCOMMON, mage.cards.b.BeastWithin.class));
        cards.add(new SetCardInfo("Bedevil", 144, Rarity.RARE, mage.cards.b.Bedevil.class));
        cards.add(new SetCardInfo("Bell Borca, Spectral Sergeant", 145, Rarity.RARE, mage.cards.b.BellBorcaSpectralSergeant.class));
        cards.add(new SetCardInfo("Blackblade Reforged", 178, Rarity.RARE, mage.cards.b.BlackbladeReforged.class));
        cards.add(new SetCardInfo("Bojuka Bog", 199, Rarity.COMMON, mage.cards.b.BojukaBog.class));
        cards.add(new SetCardInfo("Bontu's Monument", 179, Rarity.UNCOMMON, mage.cards.b.BontusMonument.class));
        cards.add(new SetCardInfo("Boros Garrison", 200, Rarity.UNCOMMON, mage.cards.b.BorosGarrison.class));
        cards.add(new SetCardInfo("Canopy Vista", 201, Rarity.RARE, mage.cards.c.CanopyVista.class));
        cards.add(new SetCardInfo("Captain Lannery Storm", 120, Rarity.RARE, mage.cards.c.CaptainLanneryStorm.class));
        cards.add(new SetCardInfo("Cascading Cataracts", 202, Rarity.RARE, mage.cards.c.CascadingCataracts.class));
        cards.add(new SetCardInfo("Chromanticore", 146, Rarity.MYTHIC, mage.cards.c.Chromanticore.class));
        cards.add(new SetCardInfo("Cinder Glade", 203, Rarity.RARE, mage.cards.c.CinderGlade.class));
        cards.add(new SetCardInfo("Coalition Relic", 180, Rarity.RARE, mage.cards.c.CoalitionRelic.class));
        cards.add(new SetCardInfo("Coiling Oracle", 147, Rarity.COMMON, mage.cards.c.CoilingOracle.class));
        cards.add(new SetCardInfo("Command Tower", 204, Rarity.COMMON, mage.cards.c.CommandTower.class));
        cards.add(new SetCardInfo("Commander's Sphere", 181, Rarity.COMMON, mage.cards.c.CommandersSphere.class));
        cards.add(new SetCardInfo("Crumbling Necropolis", 205, Rarity.UNCOMMON, mage.cards.c.CrumblingNecropolis.class));
        cards.add(new SetCardInfo("Crystal Quarry", 206, Rarity.RARE, mage.cards.c.CrystalQuarry.class));
        cards.add(new SetCardInfo("Cultivate", 130, Rarity.UNCOMMON, mage.cards.c.Cultivate.class));
        cards.add(new SetCardInfo("Day of Destiny", 99, Rarity.RARE, mage.cards.d.DayOfDestiny.class));
        cards.add(new SetCardInfo("Dragonskull Summit", 207, Rarity.RARE, mage.cards.d.DragonskullSummit.class));
        cards.add(new SetCardInfo("Drana, Liberator of Malakir", 111, Rarity.MYTHIC, mage.cards.d.DranaLiberatorOfMalakir.class));
        cards.add(new SetCardInfo("Duneblast", 148, Rarity.RARE, mage.cards.d.Duneblast.class));
        cards.add(new SetCardInfo("Echoing Truth", 109, Rarity.COMMON, mage.cards.e.EchoingTruth.class));
        cards.add(new SetCardInfo("Emperor Mihail II", 23, Rarity.RARE, mage.cards.e.EmperorMihailII.class));
        cards.add(new SetCardInfo("Etali, Primal Storm", 121, Rarity.RARE, mage.cards.e.EtaliPrimalStorm.class));
        cards.add(new SetCardInfo("Evolving Wilds", 208, Rarity.COMMON, mage.cards.e.EvolvingWilds.class));
        cards.add(new SetCardInfo("Exotic Orchard", 209, Rarity.RARE, mage.cards.e.ExoticOrchard.class));
        cards.add(new SetCardInfo("Explore", 131, Rarity.COMMON, mage.cards.e.Explore.class));
        cards.add(new SetCardInfo("Explosive Vegetation", 132, Rarity.UNCOMMON, mage.cards.e.ExplosiveVegetation.class));
        cards.add(new SetCardInfo("Faeburrow Elder", 149, Rarity.RARE, mage.cards.f.FaeburrowElder.class));
        cards.add(new SetCardInfo("Faithless Looting", 122, Rarity.COMMON, mage.cards.f.FaithlessLooting.class));
        cards.add(new SetCardInfo("Fallaji Wayfarer", 11, Rarity.RARE, mage.cards.f.FallajiWayfarer.class));
        cards.add(new SetCardInfo("Farseek", 133, Rarity.COMMON, mage.cards.f.Farseek.class));
        cards.add(new SetCardInfo("Fellwar Stone", 182, Rarity.UNCOMMON, mage.cards.f.FellwarStone.class));
        cards.add(new SetCardInfo("Flood Plain", 210, Rarity.UNCOMMON, mage.cards.f.FloodPlain.class));
        cards.add(new SetCardInfo("Foreboding Ruins", 211, Rarity.RARE, mage.cards.f.ForebodingRuins.class));
        cards.add(new SetCardInfo("Frontier Bivouac", 212, Rarity.UNCOMMON, mage.cards.f.FrontierBivouac.class));
        cards.add(new SetCardInfo("Fusion Elemental", 150, Rarity.UNCOMMON, mage.cards.f.FusionElemental.class));
        cards.add(new SetCardInfo("Garna, the Bloodflame", 151, Rarity.UNCOMMON, mage.cards.g.GarnaTheBloodflame.class));
        cards.add(new SetCardInfo("Geier Reach Sanitarium", 213, Rarity.RARE, mage.cards.g.GeierReachSanitarium.class));
        cards.add(new SetCardInfo("General Marhault Elsdragon", 31, Rarity.UNCOMMON, mage.cards.g.GeneralMarhaultElsdragon.class));
        cards.add(new SetCardInfo("Generous Gift", 100, Rarity.UNCOMMON, mage.cards.g.GenerousGift.class));
        cards.add(new SetCardInfo("Glint-Eye Nephilim", 152, Rarity.RARE, mage.cards.g.GlintEyeNephilim.class));
        cards.add(new SetCardInfo("Grasslands", 214, Rarity.UNCOMMON, mage.cards.g.Grasslands.class));
        cards.add(new SetCardInfo("Growth Spiral", 153, Rarity.COMMON, mage.cards.g.GrowthSpiral.class));
        cards.add(new SetCardInfo("Hazoret's Monument", 183, Rarity.UNCOMMON, mage.cards.h.HazoretsMonument.class));
        cards.add(new SetCardInfo("Hedron Archive", 184, Rarity.UNCOMMON, mage.cards.h.HedronArchive.class));
        cards.add(new SetCardInfo("Hero of Precinct One", 101, Rarity.RARE, mage.cards.h.HeroOfPrecinctOne.class));
        cards.add(new SetCardInfo("Hero's Blade", 186, Rarity.UNCOMMON, mage.cards.h.HerosBlade.class));
        cards.add(new SetCardInfo("Hero's Downfall", 112, Rarity.UNCOMMON, mage.cards.h.HerosDownfall.class));
        cards.add(new SetCardInfo("Heroes' Podium", 185, Rarity.RARE, mage.cards.h.HeroesPodium.class));
        cards.add(new SetCardInfo("Honor-Worn Shaku", 187, Rarity.UNCOMMON, mage.cards.h.HonorWornShaku.class));
        cards.add(new SetCardInfo("Illuna, Apex of Wishes", 154, Rarity.MYTHIC, mage.cards.i.IllunaApexOfWishes.class));
        cards.add(new SetCardInfo("Iridian Maelstrom", 12, Rarity.RARE, mage.cards.i.IridianMaelstrom.class));
        cards.add(new SetCardInfo("Jazal Goldmane", 102, Rarity.MYTHIC, mage.cards.j.JazalGoldmane.class));
        cards.add(new SetCardInfo("Josu Vess, Lich Knight", 113, Rarity.RARE, mage.cards.j.JosuVessLichKnight.class));
        cards.add(new SetCardInfo("Jungle Shrine", 215, Rarity.UNCOMMON, mage.cards.j.JungleShrine.class));
        cards.add(new SetCardInfo("Kari Zev, Skyship Raider", 123, Rarity.RARE, mage.cards.k.KariZevSkyshipRaider.class));
        cards.add(new SetCardInfo("Kaya's Wrath", 155, Rarity.RARE, mage.cards.k.KayasWrath.class));
        cards.add(new SetCardInfo("Knight of New Alara", 156, Rarity.RARE, mage.cards.k.KnightOfNewAlara.class));
        cards.add(new SetCardInfo("Kodama's Reach", 134, Rarity.COMMON, mage.cards.k.KodamasReach.class));
        cards.add(new SetCardInfo("Kothophed, Soul Hoarder", 114, Rarity.RARE, mage.cards.k.KothophedSoulHoarder.class));
        cards.add(new SetCardInfo("Krenko, Tin Street Kingpin", 124, Rarity.RARE, mage.cards.k.KrenkoTinStreetKingpin.class));
        cards.add(new SetCardInfo("Krosan Verge", 216, Rarity.UNCOMMON, mage.cards.k.KrosanVerge.class));
        cards.add(new SetCardInfo("Lavalanche", 157, Rarity.RARE, mage.cards.l.Lavalanche.class));
        cards.add(new SetCardInfo("Maelstrom Archangel", 158, Rarity.MYTHIC, mage.cards.m.MaelstromArchangel.class));
        cards.add(new SetCardInfo("Maelstrom Nexus", 159, Rarity.MYTHIC, mage.cards.m.MaelstromNexus.class));
        cards.add(new SetCardInfo("Merciless Eviction", 160, Rarity.RARE, mage.cards.m.MercilessEviction.class));
        cards.add(new SetCardInfo("Migration Path", 135, Rarity.UNCOMMON, mage.cards.m.MigrationPath.class));
        cards.add(new SetCardInfo("Mikokoro, Center of the Sea", 217, Rarity.RARE, mage.cards.m.MikokoroCenterOfTheSea.class));
        cards.add(new SetCardInfo("Mobilized District", 218, Rarity.RARE, mage.cards.m.MobilizedDistrict.class));
        cards.add(new SetCardInfo("Mortify", 161, Rarity.UNCOMMON, mage.cards.m.Mortify.class));
        cards.add(new SetCardInfo("Mountain Valley", 219, Rarity.UNCOMMON, mage.cards.m.MountainValley.class));
        cards.add(new SetCardInfo("Murmuring Bosk", 220, Rarity.RARE, mage.cards.m.MurmuringBosk.class));
        cards.add(new SetCardInfo("Mystic Monastery", 221, Rarity.UNCOMMON, mage.cards.m.MysticMonastery.class));
        cards.add(new SetCardInfo("Naya Charm", 162, Rarity.UNCOMMON, mage.cards.n.NayaCharm.class));
        cards.add(new SetCardInfo("Neheb, Dreadhorde Champion", 125, Rarity.RARE, mage.cards.n.NehebDreadhordeChampion.class));
        cards.add(new SetCardInfo("Nethroi, Apex of Death", 163, Rarity.MYTHIC, mage.cards.n.NethroiApexOfDeath.class));
        cards.add(new SetCardInfo("Night's Whisper", 115, Rarity.COMMON, mage.cards.n.NightsWhisper.class));
        cards.add(new SetCardInfo("Nomad Outpost", 222, Rarity.UNCOMMON, mage.cards.n.NomadOutpost.class));
        cards.add(new SetCardInfo("O-Kagachi, Vengeful Kami", 164, Rarity.MYTHIC, mage.cards.o.OKagachiVengefulKami.class));
        cards.add(new SetCardInfo("Odric, Lunarch Marshal", 103, Rarity.RARE, mage.cards.o.OdricLunarchMarshal.class));
        cards.add(new SetCardInfo("Oketra's Monument", 188, Rarity.UNCOMMON, mage.cards.o.OketrasMonument.class));
        cards.add(new SetCardInfo("Opulent Palace", 223, Rarity.UNCOMMON, mage.cards.o.OpulentPalace.class));
        cards.add(new SetCardInfo("Orzhov Basilica", 224, Rarity.UNCOMMON, mage.cards.o.OrzhovBasilica.class));
        cards.add(new SetCardInfo("Painful Truths", 116, Rarity.RARE, mage.cards.p.PainfulTruths.class));
        cards.add(new SetCardInfo("Path to Exile", 104, Rarity.UNCOMMON, mage.cards.p.PathToExile.class));
        cards.add(new SetCardInfo("Path to the World Tree", 136, Rarity.UNCOMMON, mage.cards.p.PathToTheWorldTree.class));
        cards.add(new SetCardInfo("Prairie Stream", 225, Rarity.RARE, mage.cards.p.PrairieStream.class));
        cards.add(new SetCardInfo("Primevals' Glorious Rebirth", 165, Rarity.RARE, mage.cards.p.PrimevalsGloriousRebirth.class));
        cards.add(new SetCardInfo("Prophetic Prism", 189, Rarity.COMMON, mage.cards.p.PropheticPrism.class));
        cards.add(new SetCardInfo("Radiant Flames", 126, Rarity.RARE, mage.cards.r.RadiantFlames.class));
        cards.add(new SetCardInfo("Rakdos Carnarium", 226, Rarity.UNCOMMON, mage.cards.r.RakdosCarnarium.class));
        cards.add(new SetCardInfo("Read the Bones", 117, Rarity.COMMON, mage.cards.r.ReadTheBones.class));
        cards.add(new SetCardInfo("Reliquary Tower", 227, Rarity.UNCOMMON, mage.cards.r.ReliquaryTower.class));
        cards.add(new SetCardInfo("Rienne, Angel of Rebirth", 166, Rarity.MYTHIC, mage.cards.r.RienneAngelOfRebirth.class));
        cards.add(new SetCardInfo("Rocky Tar Pit", 228, Rarity.UNCOMMON, mage.cards.r.RockyTarPit.class));
        cards.add(new SetCardInfo("Rosnakht, Heir of Rohgahh", 25, Rarity.RARE, mage.cards.r.RosnakhtHeirOfRohgahh.class));
        cards.add(new SetCardInfo("Sandsteppe Citadel", 229, Rarity.UNCOMMON, mage.cards.s.SandsteppeCitadel.class));
        cards.add(new SetCardInfo("Savage Lands", 230, Rarity.UNCOMMON, mage.cards.s.SavageLands.class));
        cards.add(new SetCardInfo("Search for Tomorrow", 137, Rarity.COMMON, mage.cards.s.SearchForTomorrow.class));
        cards.add(new SetCardInfo("Seaside Citadel", 231, Rarity.UNCOMMON, mage.cards.s.SeasideCitadel.class));
        cards.add(new SetCardInfo("Selvala, Explorer Returned", 167, Rarity.RARE, mage.cards.s.SelvalaExplorerReturned.class));
        cards.add(new SetCardInfo("Shanid, Sleepers' Scourge", 4, Rarity.MYTHIC, mage.cards.s.ShanidSleepersScourge.class));
        cards.add(new SetCardInfo("Shivan Gorge", 232, Rarity.RARE, mage.cards.s.ShivanGorge.class));
        cards.add(new SetCardInfo("Shizo, Death's Storehouse", 233, Rarity.RARE, mage.cards.s.ShizoDeathsStorehouse.class));
        cards.add(new SetCardInfo("Smoldering Marsh", 234, Rarity.RARE, mage.cards.s.SmolderingMarsh.class));
        cards.add(new SetCardInfo("Sol Ring", 190, Rarity.UNCOMMON, mage.cards.s.SolRing.class));
        cards.add(new SetCardInfo("Solemn Simulacrum", 191, Rarity.RARE, mage.cards.s.SolemnSimulacrum.class));
        cards.add(new SetCardInfo("Sultai Charm", 168, Rarity.UNCOMMON, mage.cards.s.SultaiCharm.class));
        cards.add(new SetCardInfo("Sunken Hollow", 235, Rarity.RARE, mage.cards.s.SunkenHollow.class));
        cards.add(new SetCardInfo("Surrak Dragonclaw", 169, Rarity.MYTHIC, mage.cards.s.SurrakDragonclaw.class));
        cards.add(new SetCardInfo("Sword of the Chosen", 192, Rarity.RARE, mage.cards.s.SwordOfTheChosen.class));
        cards.add(new SetCardInfo("Sylvan Reclamation", 170, Rarity.UNCOMMON, mage.cards.s.SylvanReclamation.class));
        cards.add(new SetCardInfo("Tajic, Blade of the Legion", 171, Rarity.RARE, mage.cards.t.TajicBladeOfTheLegion.class));
        cards.add(new SetCardInfo("Temple of Malice", 236, Rarity.RARE, mage.cards.t.TempleOfMalice.class));
        cards.add(new SetCardInfo("Temple of Silence", 237, Rarity.RARE, mage.cards.t.TempleOfSilence.class));
        cards.add(new SetCardInfo("Temple of Triumph", 238, Rarity.RARE, mage.cards.t.TempleOfTriumph.class));
        cards.add(new SetCardInfo("Tenza, Godo's Maul", 193, Rarity.UNCOMMON, mage.cards.t.TenzaGodosMaul.class));
        cards.add(new SetCardInfo("Terminate", 172, Rarity.COMMON, mage.cards.t.Terminate.class));
        cards.add(new SetCardInfo("Terramorphic Expanse", 239, Rarity.COMMON, mage.cards.t.TerramorphicExpanse.class));
        cards.add(new SetCardInfo("Teshar, Ancestor's Apostle", 105, Rarity.RARE, mage.cards.t.TesharAncestorsApostle.class));
        cards.add(new SetCardInfo("The Circle of Loyalty", 98, Rarity.MYTHIC, mage.cards.t.TheCircleOfLoyalty.class));
        cards.add(new SetCardInfo("Thrill of Possibility", 127, Rarity.COMMON, mage.cards.t.ThrillOfPossibility.class));
        cards.add(new SetCardInfo("Time Wipe", 173, Rarity.RARE, mage.cards.t.TimeWipe.class));
        cards.add(new SetCardInfo("Transguild Courier", 194, Rarity.UNCOMMON, mage.cards.t.TransguildCourier.class));
        cards.add(new SetCardInfo("Traxos, Scourge of Kroog", 195, Rarity.RARE, mage.cards.t.TraxosScourgeOfKroog.class));
        cards.add(new SetCardInfo("Two-Headed Hellkite", 14, Rarity.RARE, mage.cards.t.TwoHeadedHellkite.class));
        cards.add(new SetCardInfo("Tyrite Sanctum", 240, Rarity.RARE, mage.cards.t.TyriteSanctum.class));
        cards.add(new SetCardInfo("Unbreakable Formation", 106, Rarity.RARE, mage.cards.u.UnbreakableFormation.class));
        cards.add(new SetCardInfo("Unite the Coalition", 15, Rarity.RARE, mage.cards.u.UniteTheCoalition.class));
        cards.add(new SetCardInfo("Urza's Ruinous Blast", 107, Rarity.RARE, mage.cards.u.UrzasRuinousBlast.class));
        cards.add(new SetCardInfo("Wear // Tear", 174, Rarity.UNCOMMON, mage.cards.w.WearTear.class));
        cards.add(new SetCardInfo("Xyris, the Writhing Storm", 175, Rarity.MYTHIC, mage.cards.x.XyrisTheWrithingStorm.class));
        cards.add(new SetCardInfo("Zaxara, the Exemplary", 176, Rarity.MYTHIC, mage.cards.z.ZaxaraTheExemplary.class));
        cards.add(new SetCardInfo("Zeriam, Golden Wind", 5, Rarity.RARE, mage.cards.z.ZeriamGoldenWind.class));
        cards.add(new SetCardInfo("Zetalpa, Primal Dawn", 108, Rarity.RARE, mage.cards.z.ZetalpaPrimalDawn.class));
    }
}
