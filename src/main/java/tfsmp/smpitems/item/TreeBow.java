package tfsmp.smpitems.item;

import org.bukkit.Material;

public class TreeBow extends CustomItem
{
    public TreeBow()
    {
        super("Tree Bow", Material.BOW, Rarity.LEGENDARY, ItemType.RANGED);
        super.addLoreLine("&cYou can feel the ground start to shake...");
        super.applyMetaToStack();
    }
}