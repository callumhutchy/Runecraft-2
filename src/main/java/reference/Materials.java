package reference;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class Materials {

	public static ToolMaterial	bronze;
	public static ToolMaterial	iron;
	public static ToolMaterial	steel;
	public static ToolMaterial	black;
	public static ToolMaterial	mithril;
	public static ToolMaterial	adamant;
	public static ToolMaterial	rune;

	public Materials() {
		// ToolMaterial name = new EnumHelper().addToolMaterial(String name, int
		// harvestLevel, int maxUses, float efficiency, float damage, int
		// enchantability);

		
	}

	
	public static void init(){
		bronze = new EnumHelper().addToolMaterial("BRONZE", 1, 100, 1, 1, 1);
		iron = new EnumHelper().addToolMaterial("IRON", 2, 200, 2, 2, 1);
		steel = new EnumHelper().addToolMaterial("STEEL", 3, 400, 3, 3, 1);
		black = new EnumHelper().addToolMaterial("BLACK", 4, 900, 5, 4, 1);
		mithril = new EnumHelper().addToolMaterial("MITHRIL", 4, 800, 4, 4, 1);
		adamant = new EnumHelper().addToolMaterial("ADAMANT", 5, 1200, 5, 5, 1);
		rune = new EnumHelper().addToolMaterial("RUNE", 6, 1700, 6, 6, 1);
	}
}