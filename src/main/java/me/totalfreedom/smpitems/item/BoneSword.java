package me.totalfreedom.smpitems.item;

import me.totalfreedom.smpitems.util.Groups;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;

public class BoneSword extends CustomItem
{
    public BoneSword()
    {
        super("Bone Sword", Groups.VANILLA_SWORDS, Rarity.COMMON, ItemType.MELEE);
        super.addLoreLine("&f+300% Damage");
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 3, AttributeModifier.Operation.ADD_SCALAR);
        super.applyMetaToStack();
    }
}