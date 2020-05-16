package tfsmp.smpitems.item;

import org.bukkit.Material;

public class TubbyWitherSkeletonSkull extends CustomItem
{
    public TubbyWitherSkeletonSkull()
    {
        super("Tubby Wither Skeleton Skull", Material.WITHER_SKELETON_SKULL, Rarity.EPIC, ItemType.OTHER);
        super.addLoreLine("&cObtain two to summon him...");
        super.applyMetaToStack();
    }
}