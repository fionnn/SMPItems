package tfsmp.smpitems.item;

import org.bukkit.Material;

public class Battery extends CustomItem
{
    public Battery()
    {
        super("Battery", Material.DRAGON_BREATH, Rarity.LEGENDARY, ItemType.OTHER);
        super.addLoreLine("&cInfinite charge?");
        super.addLoreLine("&eShortens item delays.");
        super.applyMetaToStack();
    }
}