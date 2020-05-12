package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class spoon extends CustomItem
{
    public spoon()
    {
        super("spoon", Material.DIAMOND_SHOVEL, Rarity.LEGENDARY);
        super.addLoreLine('&c"wait this is not a spoon?"')
        super.addLoreLine("&f20 Efficiency")
        super.addLoreLine("&f10 Unbreaking")
        super.addEnchant(Enchantment.DURABILITY, 10);
        super.applyMetaToStack();
    }
}