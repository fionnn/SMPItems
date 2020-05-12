package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Shovel extends CustomItem
{
    public Shovel()
    {
        super("Shovel", Material.IRON_SHOVEL, Rarity.COMMON);
        super.addLoreLine("&f2 Unbreaking")
        super.addEnchant(Enchantment.DURABILITY, 2);
        super.applyMetaToStack();
    }
}