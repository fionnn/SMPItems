package tfsmp.smpitems.item;

import org.bukkit.attribute.Attribute;
import tfsmp.smpitems.util.Groups;

public class Axe extends CustomItem
{
    public Axe()
    {
        super( "Axe!", Groups.VANILLA_AXES, Rarity.RARE, ItemType.MELEE);
        super.addLoreLine("&f+150% Speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 1.5);
        super.applyMetaToStack();
    }
}