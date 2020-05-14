package tfsmp.smpitems.item;

import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class DaHoe extends CustomItem
{
    public DaHoe()
    {
        super("da hoe", Groups.VANILLA_HOES, Rarity.UNCOMMON, ItemType.TOOLS);
        super.addLoreLine("&a&oUnbreaking 5");
        super.addEnchant(Enchantment.DURABILITY, 5);
        super.applyMetaToStack();
    }
}