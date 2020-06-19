package me.totalfreedom.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;

public class Bee extends CustomItem
{
    public Bee()
    {
        super("The Bee", Material.SHIELD, Rarity.LEGENDARY, ItemType.SHIELD);
        super.addLoreLine("&cFloat like a butterfly...");
        super.addLoreLine("&b+500% Damage");
        super.addLoreLine("&a+5 Health");
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 5);
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 5, AttributeModifier.Operation.ADD_SCALAR);
        super.applyMetaToStack();
    }
}