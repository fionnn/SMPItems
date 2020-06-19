package me.totalfreedom.smpitems.util;

import lombok.Getter;
import org.bukkit.enchantments.Enchantment;

public class CompactEnchantment
{
    @Getter
    private final Enchantment enchantment;

    @Getter
    private final int level;

    public CompactEnchantment(Enchantment enchantment, int level)
    {
        this.enchantment = enchantment;
        this.level = level;
    }
}