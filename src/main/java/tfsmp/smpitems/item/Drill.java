package tfsmp.smpitems.item;

import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class Drill extends CustomItem
{
    public Drill()
    {
        super("Drill", Groups.VANILLA_PICKAXES, Rarity.LEGENDARY, ItemType.TOOLS);
        super.addLoreLine("&cdrill go BRRR");
        super.addLoreLine("&eEfficiency 10");
        super.addEnchant(Enchantment.DIG_SPEED, 10);
        super.applyMetaToStack();
    }
}