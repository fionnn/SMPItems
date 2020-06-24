package me.totalfreedom.smpitems.item.variant;

import org.bukkit.enchantments.Enchantment;

public class Sharp extends Variant
{
    public Sharp()
    {
        super("Sharp");
        super.addEnchant(Enchantment.DAMAGE_ALL, 2);
    }
}