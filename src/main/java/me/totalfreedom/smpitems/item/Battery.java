package me.totalfreedom.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Battery extends CustomItem
{
    public Battery()
    {
        super("Broken Battery", Material.REDSTONE_BLOCK, Rarity.SPECIAL, ItemType.OTHER);
        super.addLoreLine("&cit's broken... ajax can you fix this?");
        super.addLoreLine("&e&oKnockback 10");
        super.addEnchant(Enchantment.KNOCKBACK, 10);
        super.applyMetaToStack();
    }
}