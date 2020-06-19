package me.totalfreedom.smpitems.item;

import me.totalfreedom.smpitems.util.Groups;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;

public class FreedomSword extends CustomItem
{
    public FreedomSword()
    {
        super("Freedom Sword", Groups.VANILLA_SWORDS, Rarity.RARE, ItemType.MELEE);
        super.addLoreLine("&b+100% Speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 1, AttributeModifier.Operation.ADD_SCALAR);
        super.applyMetaToStack();
    }
}