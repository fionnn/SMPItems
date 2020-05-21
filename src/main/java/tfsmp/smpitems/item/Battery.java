package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;

public class Battery extends CustomItem
{
    public Battery()
    {
        super("Battery", Material.DRAGON_BREATH, Rarity.LEGENDARY, ItemType.OTHER);
        super.addLoreLine("&cInfinite charge?");
        super.addLoreLine("&bShortens item delays.");
        super.applyMetaToStack();
    }
}