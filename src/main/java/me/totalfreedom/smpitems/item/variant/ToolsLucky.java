package me.totalfreedom.smpitems.item.variant;

import org.bukkit.enchantments.Enchantment;

public class ToolsLucky extends Variant
{
    public ToolsLucky()
    {
        super("Lucky");
        super.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 3);
    }
}