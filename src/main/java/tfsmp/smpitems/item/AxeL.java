package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class WitherAxe extends CustomItem
{
    public WitherAxe()
    {
        super("Axe!", Material.DIAMOND_AXE, Rarity.RARE);
        super.addLoreLine("&f5 Efficiency")
        super.addEnchant(Enchantment.DIG_SPEED, 5);
        super.applyMetaToStack();
    }
}