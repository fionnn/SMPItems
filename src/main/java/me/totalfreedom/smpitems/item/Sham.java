package me.totalfreedom.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;

public class Sham extends CustomItem
{
    public Sham()
    {
        super("The Sham", Material.SHIELD, Rarity.LEGENDARY, ItemType.SHIELD);
        super.addLoreLine("&cDamage? Absorbed.");
        super.addLoreLine("&b50% Damage Reduction.");
        super.addLoreLine("&a+2 Health");
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 2);
        super.applyMetaToStack();
    }
}