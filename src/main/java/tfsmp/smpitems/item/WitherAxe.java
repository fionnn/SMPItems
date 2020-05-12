package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class WitherAxe extends CustomItem
{
    public WitherAxe()
    {
        super(ChatColor.GOLD + "Wither Axe", Material.DIAMOND_AXE, Rarity.LEGENDARY);
        super.addLoreLine("&cThe &4tip &cwithers...");
        super.addEnchant(Enchantment.DIG_SPEED, 10);
        super.applyMetaToStack();
    }
}