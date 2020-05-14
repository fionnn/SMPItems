package tfsmp.smpitems.item;

import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class Hoe extends CustomItem
{
    public Hoe()
    {
        super("hoe", Groups.VANILLA_HOES, Rarity.COMMON, ItemType.TOOLS);
        super.addLoreLine("&fEfficiency 2");
        super.addEnchant(Enchantment.DIG_SPEED, 2);
        super.applyMetaToStack();
    }
}