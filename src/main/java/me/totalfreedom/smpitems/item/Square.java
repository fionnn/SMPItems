package me.totalfreedom.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Square extends CustomItem
{
    public Square()
    {
        super("shape", Material.QUARTZ_BLOCK, Rarity.SPECIAL, ItemType.OTHER);
        super.addLoreLine("&cthis is a cube not a square");
        super.addLoreLine("&e&oKnockback 10");
        super.addEnchant(Enchantment.KNOCKBACK, 10);
        super.applyMetaToStack();
    }
}