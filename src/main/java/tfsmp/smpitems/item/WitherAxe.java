package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class WitherAxe extends CustomItem
{
    public WitherAxe()
    {
        super(ChatColor.DARK_GRAY + "Wither Axe", Material.DIAMOND_AXE);
        super.addEnchant(Enchantment.DIG_SPEED, 10);
        super.applyMetaToStack();
    }
}