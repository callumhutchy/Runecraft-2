package reference;

import net.minecraftforge.fml.common.registry.GameRegistry;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityAnvil;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.TileEntityRCFurnace;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityAirAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityAirRuneAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityBloodAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityBloodRuneAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityBodyAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityBodyRuneAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityChaosAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityChaosRuneAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityCosmicAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityCosmicRuneAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityDeathAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityDeathRuneAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityEarthAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityEarthRuneAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityFireAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityFireRuneAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityLawAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityLawRuneAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityMindAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityMindRuneAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityNatureAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityNatureRuneAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityWaterAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.altars.TileEntityWaterRuneAltar;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityAdamantiteOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityCoalOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityCopperOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityGoldOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityIronOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityMithrilOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityPureEssenceOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityRuneEssenceOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityRuniteOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntitySilverOre;
import uk.co.callumhutchy.runecraft2.blocks.models.tileentities.ores.TileEntityTinOre;
import uk.co.callumhutchy.runecraft2.client.gui.tileentities.TileEntitySkills;

public class TileEntities {

	public static void init(){
		//Altars (base)
		GameRegistry.registerTileEntity(TileEntityAirAltar.class, "teairaltar");
		GameRegistry.registerTileEntity(TileEntityBloodAltar.class, "tebloodaltar");
		GameRegistry.registerTileEntity(TileEntityBodyAltar.class, "tebodyaltar");
		GameRegistry.registerTileEntity(TileEntityChaosAltar.class, "techaosaltar");
		GameRegistry.registerTileEntity(TileEntityCosmicAltar.class, "tecosmicaltar");
		GameRegistry.registerTileEntity(TileEntityDeathAltar.class, "tedeathaltar");
		GameRegistry.registerTileEntity(TileEntityEarthAltar.class, "teearthaltar");
		GameRegistry.registerTileEntity(TileEntityFireAltar.class, "tefirealtar");
		GameRegistry.registerTileEntity(TileEntityLawAltar.class, "telawaltar");
		GameRegistry.registerTileEntity(TileEntityMindAltar.class, "temindaltar");
		GameRegistry.registerTileEntity(TileEntityNatureAltar.class, "tenaturealtar");
		GameRegistry.registerTileEntity(TileEntityWaterAltar.class, "tewateraltar");
		
		//Altars (rune)
		GameRegistry.registerTileEntity(TileEntityAirRuneAltar.class, "teairrunealtar");
		GameRegistry.registerTileEntity(TileEntityBloodRuneAltar.class, "tebloodrunealtar");
		GameRegistry.registerTileEntity(TileEntityBodyRuneAltar.class, "tebodyrunealtar");
		GameRegistry.registerTileEntity(TileEntityChaosRuneAltar.class, "techaosrunealtar");
		GameRegistry.registerTileEntity(TileEntityCosmicRuneAltar.class, "tecosmicrunealtar");
		GameRegistry.registerTileEntity(TileEntityDeathRuneAltar.class, "tedeathrunealtar");
		GameRegistry.registerTileEntity(TileEntityEarthRuneAltar.class, "teearthrunealtar");
		GameRegistry.registerTileEntity(TileEntityFireRuneAltar.class, "tefirerunealtar");
		GameRegistry.registerTileEntity(TileEntityLawRuneAltar.class, "telawrunealtar");
		GameRegistry.registerTileEntity(TileEntityMindRuneAltar.class, "temindrunealtar");
		GameRegistry.registerTileEntity(TileEntityNatureRuneAltar.class, "tenaturerunealtar");
		GameRegistry.registerTileEntity(TileEntityWaterRuneAltar.class, "tewaterrunealtar");
		
		//Guis
		GameRegistry.registerTileEntity(TileEntitySkills.class, "teskillsgui");
		//GameRegistry.registerTileEntity(TileEntityRCFurnace.class, "tercfurnacegui");
		
		//Spells
		
		//Ores
		GameRegistry.registerTileEntity(TileEntityAdamantiteOre.class, "teadamantiteore");
		GameRegistry.registerTileEntity(TileEntityCoalOre.class, "tecoalore");
		GameRegistry.registerTileEntity(TileEntityCopperOre.class, "tecopperore");
		GameRegistry.registerTileEntity(TileEntityGoldOre.class, "tegoldore");
		GameRegistry.registerTileEntity(TileEntityIronOre.class, "teironore");
		GameRegistry.registerTileEntity(TileEntityMithrilOre.class, "temithrilore");
		GameRegistry.registerTileEntity(TileEntityPureEssenceOre.class, "tepureessenceore");
		GameRegistry.registerTileEntity(TileEntityRuneEssenceOre.class, "teruneessenceore");
		GameRegistry.registerTileEntity(TileEntityRuniteOre.class, "teruniteore");
		GameRegistry.registerTileEntity(TileEntitySilverOre.class, "tesilverore");
		GameRegistry.registerTileEntity(TileEntityTinOre.class, "tetinore");
		
		GameRegistry.registerTileEntity(TileEntityRCFurnace.class, "tercfurnace");
		GameRegistry.registerTileEntity(TileEntityAnvil.class, "teanvil");
		
	}
}
