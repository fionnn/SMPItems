package me.totalfreedom.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class POWbow extends CustomItem
{
    public POWbow()
    {
        super("POW! Bow", Material.BOW, Rarity.LEGENDARY, ItemType.RANGED);
        super.addLoreLine("&cBOOM!");
        super.addLoreLine("&ePower 10");
        super.addLoreLine("&ePunch 20");
        super.addEnchant(Enchantment.ARROW_DAMAGE, 10);
        super.addEnchant(Enchantment.ARROW_KNOCKBACK, 20);
        super.applyMetaToStack();
    }
}