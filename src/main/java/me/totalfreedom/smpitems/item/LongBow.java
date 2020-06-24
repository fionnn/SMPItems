package me.totalfreedom.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class LongBow extends CustomItem
{
    public LongBow()
    {
        super("Long Bow", Material.BOW, Rarity.COMMON, ItemType.RANGED);
        super.addLoreLine("&fPower 5");
        super.addEnchant(Enchantment.ARROW_DAMAGE, 5);
        super.applyMetaToStack();
    }
}