package uk.co.callumhutchy.runecraft2.items;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import reference.ItemNames;
import reference.Materials;
import reference.Reference;
import uk.co.callumhutchy.runecraft2.spells.Elements;

public class Items {


	// Runes
	public static Rune	airRune, armadylRune, astralRune, bloodRune, bodyRune,
			chaosRune, cosmicRune, deathRune, dustRune, earthRune, fireRune,
			lavaRune, lawRune, mindRune, mistRune, mudRune, natureRune,
			smokeRune, soulRune, steamRune, waterRune;

	public static Item	runeEssence, pureEssence;

	// Talismans
	public static Item	airTalisman, waterTalisman, fireTalisman,
			earthTalisman, mindTalisman, bodyTalisman, cosmicTalisman,
			chaosTalisman, natureTalisman, lawTalisman, deathTalisman,
			bloodTalisman, astralTalisman, soulTalisman;

	public static Item	airTalismanStaff, waterTalismanStaff,
			fireTalismanStaff, earthTalismanStaff, mindTalismanStaff,
			bodyTalismanStaff, cosmicTalismanStaff, chaosTalismanStaff,
			natureTalismanStaff, lawTalismanStaff, deathTalismanStaff,
			bloodTalismanStaff;

	// Ores
	public static Item	adamantiteOre, coalOre, copperOre, goldOre, ironOre,
			mithrilOre, runiteOre, silverOre, tinOre;

	// Bars
	public static Item	bronzeBar, ironBar, silverBar, steelBar, goldBar,
			mithrilBar, adamantBar, runeBar;

	public static Item	spellbook, philosophersstone;

	public static Item	staff, staffofair, staffofwater, staffofearth,
			staffoffire;

	// Hatchets
	public static Item	bronzehatchet, ironhatchet, steelhatchet, blackhatchet,
			mithrilhatchet, adamanthatchet, runehatchet;

	// Pickaxes
	public static Item	bronzepickaxe, ironpickaxe, steelpickaxe,
			mithrilpickaxe, adamantpickaxe, runepickaxe;
	
	public static Item  bronzesword, ironsword, steelsword, blacksword, mithrilsword, adamantsword, runesword;
	public static Item bronzescimitar, ironscimitar, steelscimitar, blackscimitar, mithrilscimitar, adamantscimitar, runescimitar;
	public static Item bronzewarhammer, ironwarhammer, steelwarhammer, blackwarhammer, mithrilwarhammer, adamantwarhammer, runewarhammer;
	public static Item bronzebattleaxe, ironbattleaxe, steelbattleaxe, blackbattleaxe, mithrilbattleaxe, adamantbattleaxe, runebattleaxe;
	

	public static void init() {
		// Runes
		airRune = new Rune(ItemNames.AirRune_Unlo);
		armadylRune = new Rune(ItemNames.ArmadylRune_Unlo);
		astralRune = new Rune(ItemNames.AstralRune_Unlo);
		bloodRune = new Rune(ItemNames.BloodRune_Unlo);
		bodyRune = new Rune(ItemNames.BodyRune_Unlo);
		chaosRune = new Rune(ItemNames.ChaosRune_Unlo);
		cosmicRune = new Rune(ItemNames.CosmicRune_Unlo);
		deathRune = new Rune(ItemNames.DeathRune_Unlo);
		dustRune = new Rune(ItemNames.DustRune_Unlo);
		earthRune = new Rune(ItemNames.EarthRune_Unlo);
		fireRune = new Rune(ItemNames.FireRune_Unlo);
		lavaRune = new Rune(ItemNames.LavaRune_Unlo);
		lawRune = new Rune(ItemNames.LawRune_Unlo);
		mindRune = new Rune(ItemNames.MindRune_Unlo);
		mistRune = new Rune(ItemNames.MistRune_Unlo);
		mudRune = new Rune(ItemNames.MudRune_Unlo);
		natureRune = new Rune(ItemNames.NatureRune_Unlo);
		smokeRune = new Rune(ItemNames.SmokeRune_Unlo);
		soulRune = new Rune(ItemNames.SoulRune_Unlo);
		steamRune = new Rune(ItemNames.SteamRune_Unlo);
		waterRune = new Rune(ItemNames.WaterRune_Unlo);
		
		Elements.air.setRune(airRune);
		Elements.water.setRune(waterRune);
		Elements.earth.setRune(earthRune);
		Elements.fire.setRune(fireRune);

		runeEssence = new Rune(ItemNames.RuneEssence_Unlo);
		pureEssence = new Rune(ItemNames.PureEssence_Unlo);
		// Talismans
		airTalisman = new BaseMagicItem(ItemNames.AirTalisman_Unlo, 1);
		waterTalisman = new BaseMagicItem(ItemNames.WaterTalisman_Unlo, 1);
		fireTalisman = new BaseMagicItem(ItemNames.FireTalisman_Unlo, 1);
		earthTalisman = new BaseMagicItem(ItemNames.EarthTalisman_Unlo, 1);
		mindTalisman = new BaseMagicItem(ItemNames.MindTalisman_Unlo, 1);
		bodyTalisman = new BaseMagicItem(ItemNames.BodyTalisman_Unlo, 1);
		cosmicTalisman = new BaseMagicItem(ItemNames.CosmicTalisman_Unlo, 1);
		chaosTalisman = new BaseMagicItem(ItemNames.ChaosTalisman_Unlo, 1);
		natureTalisman = new BaseMagicItem(ItemNames.NatureTalisman_Unlo, 1);
		lawTalisman = new BaseMagicItem(ItemNames.LawTalisman_Unlo, 1);
		deathTalisman = new BaseMagicItem(ItemNames.DeathTalisman_Unlo, 1);
		bloodTalisman = new BaseMagicItem(ItemNames.BloodTalisman_Unlo, 1);
		astralTalisman = new BaseMagicItem(ItemNames.AstralTalisman_Unlo, 1);

		airTalismanStaff = new Staff(ItemNames.AirTalismanStaff_Unlo, 1, null, 0, true);
		waterTalismanStaff = new Staff(ItemNames.WaterTalismanStaff_Unlo, 1, null, 0, true);
		fireTalismanStaff = new Staff(ItemNames.FireTalismanStaff_Unlo, 1, null, 0, true);
		earthTalismanStaff = new Staff(ItemNames.EarthTalismanStaff_Unlo, 1, null, 0, true);
		mindTalismanStaff = new Staff(ItemNames.MindTalismanStaff_Unlo, 1, null, 0, true);
		bodyTalismanStaff = new Staff(ItemNames.BodyTalismanStaff_Unlo, 1, null, 0, true);
		cosmicTalismanStaff = new Staff(ItemNames.CosmicTalismanStaff_Unlo, 1, null, 0, true);
		chaosTalismanStaff = new Staff(ItemNames.ChaosTalismanStaff_Unlo, 1, null, 0, true);
		natureTalismanStaff = new Staff(ItemNames.NatureTalismanStaff_Unlo, 1, null, 0, true);
		lawTalismanStaff = new Staff(ItemNames.LawTalismanStaff_Unlo, 1, null, 0, true);
		deathTalismanStaff = new Staff(ItemNames.DeathTalismanStaff_Unlo, 1, null, 0, true);
		bloodTalismanStaff = new Staff(ItemNames.BloodTalismanStaff_Unlo, 1, null, 0, true);

		// Ores
		adamantiteOre = new Ore(ItemNames.AdamantiteOre_Unlo);
		coalOre = new Ore(ItemNames.CoalOre_Unlo);
		copperOre = new Ore(ItemNames.CopperOre_Unlo);
		goldOre = new Ore(ItemNames.GoldOre_Unlo);
		ironOre = new Ore(ItemNames.IronOre_Unlo);
		mithrilOre = new Ore(ItemNames.MithrilOre_Unlo);
		runiteOre = new Ore(ItemNames.RuniteOre_Unlo);
		silverOre = new Ore(ItemNames.SilverOre_Unlo);
		tinOre = new Ore(ItemNames.TinOre_Unlo);

		// Bars
		bronzeBar = new Bar(ItemNames.BronzeBar_Unlo);
		ironBar = new Bar(ItemNames.IronBar_Unlo);
		silverBar = new Bar(ItemNames.SilverBar_Unlo);
		steelBar = new Bar(ItemNames.SteelBar_Unlo);
		goldBar = new Bar(ItemNames.GoldBar_Unlo);
		mithrilBar = new Bar(ItemNames.MithrilBar_Unlo);
		adamantBar = new Bar(ItemNames.AdamantBar_Unlo);
		runeBar = new Bar(ItemNames.RuneBar_Unlo);

		spellbook = new SpellBook(ItemNames.SpellBook_Unlo, 1);
	
		
		// Staves
		staff = new Staff(ItemNames.Staff_Unlo, 1, null, 0, false);
		staffofair = new Staff(ItemNames.StaffOfAir_Unlo, 1, Elements.air, 1, false);
		staffofwater = new Staff(ItemNames.StaffOfWater_Unlo, 1, Elements.water, 1, false);
		staffofearth = new Staff(ItemNames.StaffOfEarth_Unlo, 1, Elements.earth, 1, false);
		staffoffire = new Staff(ItemNames.StaffOfFire_Unlo, 1, Elements.fire, 1, false);

		// Hatchets
		bronzehatchet = new Hatchet(Materials.bronze, ItemNames.BronzeHatchet_Unlo);
		ironhatchet = new Hatchet(Materials.iron, ItemNames.IronHatchet_Unlo);
		steelhatchet = new Hatchet(Materials.steel, ItemNames.SteelHatchet_Unlo);
		blackhatchet = new Hatchet(Materials.black, ItemNames.BlackHatchet_Unlo);
		mithrilhatchet = new Hatchet(Materials.mithril, ItemNames.MithrilHatchet_Unlo);
		adamanthatchet = new Hatchet(Materials.adamant, ItemNames.AdamantHatchet_Unlo);
		runehatchet = new Hatchet(Materials.rune, ItemNames.RuneHatchet_Unlo);
		
		//Swords
		bronzesword = new Sword(Materials.bronze, ItemNames.BronzeSword_Unlo);
		ironsword = new Sword(Materials.iron, ItemNames.IronSword_Unlo);
		steelsword = new Sword(Materials.steel, ItemNames.SteelSword_Unlo);
		blacksword = new Sword(Materials.black, ItemNames.BlackSword_Unlo);
		mithrilsword = new Sword(Materials.mithril, ItemNames.MithrilSword_Unlo);
		adamantsword = new Sword(Materials.adamant, ItemNames.AdamantSword_Unlo);
		runesword = new Sword(Materials.rune, ItemNames.RuneSword_Unlo);
		
		//Pickaxes
		bronzepickaxe = new Pickaxe(Materials.bronze, ItemNames.BronzePickaxe_Unlo);
		ironpickaxe = new Pickaxe(Materials.iron, ItemNames.IronPickaxe_Unlo);
		steelpickaxe = new Pickaxe(Materials.steel, ItemNames.SteelPickaxe_Unlo);
		mithrilpickaxe = new Pickaxe(Materials.mithril, ItemNames.MithrilPickaxe_Unlo);
		adamantpickaxe = new Pickaxe(Materials.adamant, ItemNames.AdamantPickaxe_Unlo);
		runepickaxe = new Pickaxe(Materials.rune, ItemNames.RunePickaxe_Unlo);

	}

	public static void gameRegistery() {
		// Runes
		GameRegistry.registerItem(airRune, airRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(armadylRune, armadylRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(astralRune, astralRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bloodRune, bloodRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bodyRune, bodyRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(chaosRune, chaosRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cosmicRune, cosmicRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(deathRune, deathRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(dustRune, dustRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthRune, earthRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fireRune, fireRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lavaRune, lavaRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lawRune, lawRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mindRune, mindRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mistRune, mistRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mudRune, mudRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(natureRune, natureRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(smokeRune, smokeRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(soulRune, soulRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steamRune, steamRune.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(waterRune, waterRune.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(runeEssence, runeEssence.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(pureEssence, pureEssence.getUnlocalizedName().substring(5));

		// Talismans
		GameRegistry.registerItem(airTalisman, airTalisman.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(waterTalisman, waterTalisman.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fireTalisman, fireTalisman.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthTalisman, earthTalisman.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mindTalisman, mindTalisman.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bodyTalisman, bodyTalisman.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cosmicTalisman, cosmicTalisman.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(chaosTalisman, chaosTalisman.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(natureTalisman, natureTalisman.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lawTalisman, lawTalisman.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(deathTalisman, deathTalisman.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bloodTalisman, bloodTalisman.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(astralTalisman, astralTalisman.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(airTalismanStaff, airTalismanStaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(waterTalismanStaff, waterTalismanStaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(fireTalismanStaff, fireTalismanStaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(earthTalismanStaff, earthTalismanStaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mindTalismanStaff, mindTalismanStaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bodyTalismanStaff, bodyTalismanStaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(cosmicTalismanStaff, cosmicTalismanStaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(chaosTalismanStaff, chaosTalismanStaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(natureTalismanStaff, natureTalismanStaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(lawTalismanStaff, lawTalismanStaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(deathTalismanStaff, deathTalismanStaff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(bloodTalismanStaff, bloodTalismanStaff.getUnlocalizedName().substring(5));

		// Ores
		/*GameRegistry.registerItem(adamantiteOre, adamantiteOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(coalOre, coalOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(copperOre, copperOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(goldOre, goldOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ironOre, ironOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mithrilOre, mithrilOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(runiteOre, runiteOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(silverOre, silverOre.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(tinOre, tinOre.getUnlocalizedName().substring(5));*/

		// Bars
		GameRegistry.registerItem(bronzeBar, bronzeBar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ironBar, ironBar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(silverBar, silverBar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelBar, steelBar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(goldBar, goldBar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mithrilBar, mithrilBar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(adamantBar, adamantBar.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(runeBar, runeBar.getUnlocalizedName().substring(5));

		GameRegistry.registerItem(spellbook, spellbook.getUnlocalizedName().substring(5));
		
		//GameRegistry.registerItem(philosophersstone, philosophersstone.getUnlocalizedName());

		// Staves
		GameRegistry.registerItem(staff, staff.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(staffofair, staffofair.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(staffofwater, staffofwater.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(staffofearth, staffofearth.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(staffoffire, staffoffire.getUnlocalizedName().substring(5));

		// Hatchet
		GameRegistry.registerItem(bronzehatchet, bronzehatchet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ironhatchet, ironhatchet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelhatchet, steelhatchet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(blackhatchet, blackhatchet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mithrilhatchet, mithrilhatchet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(adamanthatchet, adamanthatchet.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(runehatchet, runehatchet.getUnlocalizedName().substring(5));
		
		//Sword
		GameRegistry.registerItem(bronzesword, bronzesword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ironsword, ironsword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelsword, steelsword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(blacksword, blacksword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mithrilsword, mithrilsword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(adamantsword, adamantsword.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(runesword, runesword.getUnlocalizedName().substring(5));
		
		//Pickaxes
		GameRegistry.registerItem(bronzepickaxe, bronzepickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(ironpickaxe, ironpickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(steelpickaxe, steelpickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(mithrilpickaxe, mithrilpickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(adamantpickaxe, adamantpickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(runepickaxe, runepickaxe.getUnlocalizedName().substring(5));
		
	}
	
	
	
	public static void registerRenders(){
		registerRender(airTalismanStaff);
		registerRender(waterTalismanStaff);
		registerRender(fireTalismanStaff);
		registerRender(earthTalismanStaff);
		registerRender(mindTalismanStaff);
		registerRender(bodyTalismanStaff);
		registerRender(cosmicTalismanStaff);
		registerRender(chaosTalismanStaff);
		registerRender(natureTalismanStaff);
		registerRender(lawTalismanStaff);
		registerRender(deathTalismanStaff);
		registerRender(bloodTalismanStaff);
		registerRender(adamantiteOre);
		registerRender(coalOre);
		registerRender(copperOre);
		registerRender(goldOre);
		registerRender(ironOre);
		registerRender(mithrilOre);
		registerRender(runiteOre);
		registerRender(silverOre);
		registerRender(tinOre);
		registerRender(spellbook);
		registerRender(bronzeBar);
		registerRender(ironBar);
		registerRender(silverBar);
		registerRender(steelBar);
		registerRender(goldBar);
		registerRender(mithrilBar);
		registerRender(adamantBar);
		registerRender(runeBar);
		registerRender(staff);
		registerRender(staffofair);
		registerRender(staffofwater);
		registerRender(staffofearth);
		registerRender(staffoffire);
		registerRender(bronzehatchet);
		registerRender(ironhatchet);
		registerRender(steelhatchet);
		registerRender(blackhatchet);
		registerRender(mithrilhatchet);
		registerRender(adamanthatchet);
		registerRender(runehatchet);
		registerRender(airRune);
		registerRender(armadylRune);
		registerRender(astralRune);
		registerRender(bloodRune);
		registerRender(bodyRune);
		registerRender(chaosRune);
		registerRender(cosmicRune);
		registerRender(deathRune);
		registerRender(dustRune);
		registerRender(earthRune);
		registerRender(fireRune);
		registerRender(lavaRune);
		registerRender(lawRune);
		registerRender(mindRune);
		registerRender(mistRune);
		registerRender(mudRune);
		registerRender(natureRune);
		registerRender(smokeRune);
		registerRender(soulRune);
		registerRender(steamRune);
		registerRender(waterRune);
		registerRender(runeEssence);
		registerRender(pureEssence);
		registerRender(airTalisman);
		registerRender(waterTalisman);
		registerRender(fireTalisman);
		registerRender(earthTalisman);
		registerRender(mindTalisman);
		registerRender(bodyTalisman);
		registerRender(cosmicTalisman);
		registerRender(chaosTalisman);
		registerRender(natureTalisman);
		registerRender(lawTalisman);
		registerRender(deathTalisman);
		registerRender(bloodTalisman);
		registerRender(astralTalisman);
		//registerRender(soulTalisman);
		registerRender(bronzepickaxe);
		registerRender(ironpickaxe);
		registerRender(steelpickaxe);
		registerRender(mithrilpickaxe);
		registerRender(adamantpickaxe);
		registerRender(runepickaxe);
		
		//Sword
		registerRender(bronzesword);
		registerRender(ironsword);
		registerRender(steelsword);
		registerRender(blacksword);
		registerRender(mithrilsword);
		registerRender(adamantsword);
		registerRender(runesword);
		
		
	}
	
	
	public static void registerRender(Item item){
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
	}

	
	public static void craftingRecipes() {
		// Talismans
		GameRegistry.addShapelessRecipe(new ItemStack(airTalisman), airRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(waterTalisman), waterRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(fireTalisman), fireRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(earthTalisman), earthRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(mindTalisman), mindRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(bodyTalisman), bodyRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(cosmicTalisman), cosmicRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(chaosTalisman), chaosRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(natureTalisman), natureRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(lawTalisman), lawRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(deathTalisman), deathRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(bloodTalisman), bloodRune, Item.getItemById(280));
		GameRegistry.addShapelessRecipe(new ItemStack(astralTalisman), astralRune, Item.getItemById(280));

		GameRegistry.addShapelessRecipe(new ItemStack(spellbook), Item.getItemById(340), runeEssence);

		// Staffs
		GameRegistry.addShapedRecipe(new ItemStack(staff), new Object[] { "OOX", "OXO", "XOO", 'X', Item.getItemById(280) });
		GameRegistry.addShapelessRecipe(new ItemStack(staffofair), staff,  airRune );
		GameRegistry.addShapelessRecipe(new ItemStack(staffofwater), staff, waterRune );
		GameRegistry.addShapelessRecipe(new ItemStack(staffofearth), staff, earthRune );
		GameRegistry.addShapelessRecipe(new ItemStack(staffoffire),  staff,  fireRune );
		// Talisman Staff
		GameRegistry.addShapelessRecipe(new ItemStack(airTalismanStaff), staff, airTalisman);
		GameRegistry.addShapelessRecipe(new ItemStack(waterTalismanStaff), staff, waterTalisman);
		GameRegistry.addShapelessRecipe(new ItemStack(fireTalismanStaff), staff, fireTalisman);
		GameRegistry.addShapelessRecipe(new ItemStack(earthTalismanStaff), staff, earthTalisman);
		GameRegistry.addShapelessRecipe(new ItemStack(mindTalismanStaff), staff, mindTalisman);
		GameRegistry.addShapelessRecipe(new ItemStack(bodyTalismanStaff), staff, bodyTalisman);
		GameRegistry.addShapelessRecipe(new ItemStack(cosmicTalismanStaff), staff, cosmicTalisman);
		GameRegistry.addShapelessRecipe(new ItemStack(chaosTalismanStaff), staff, chaosTalisman);
		GameRegistry.addShapelessRecipe(new ItemStack(natureTalismanStaff), staff, natureTalisman);
		GameRegistry.addShapelessRecipe(new ItemStack(lawTalismanStaff), staff, lawTalisman);
		GameRegistry.addShapelessRecipe(new ItemStack(deathTalismanStaff), staff, deathTalisman);
		GameRegistry.addShapelessRecipe(new ItemStack(bloodTalismanStaff), staff, bloodTalisman);

	}

}
