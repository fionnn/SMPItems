package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Superfood extends CustomItem
{
    public Superfood()
    {
        super( "Superfood", Material.GLISTERING_MELON_SLICE, Rarity.UNCOMMON, ItemType.OTHER);
        super.addLoreLine("&bRestore full hunger!");
        super.addLoreLine("&760s Cooldown");
        super.addEnchant(Enchantment.DURABILITY, 1);
        super.applyMetaToStack();
    }
}