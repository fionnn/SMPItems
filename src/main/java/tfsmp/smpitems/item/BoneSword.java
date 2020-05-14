package tfsmp.smpitems.item;

import org.bukkit.attribute.Attribute;
import tfsmp.smpitems.util.Groups;

public class BoneSword extends CustomItem
{
    public BoneSword()
    {
        super("Bone Sword", Groups.VANILLA_SWORDS, Rarity.COMMON, ItemType.MELEE);
        super.addLoreLine("&f+300% Damage");
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 3.0);
        super.applyMetaToStack();
    }
}