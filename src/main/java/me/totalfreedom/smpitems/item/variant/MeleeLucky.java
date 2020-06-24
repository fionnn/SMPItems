package me.totalfreedom.smpitems.item.variant;

import org.bukkit.enchantments.Enchantment;

public class MeleeLucky extends Variant
{
    public MeleeLucky()
    {
        super("Lucky");
        super.addEnchant(Enchantment.LOOT_BONUS_MOBS, 1);
    }
}