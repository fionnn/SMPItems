package me.totalfreedom.smpitems.item;

import org.bukkit.Material;

public class Phaser extends CustomItem
{
    public Phaser()
    {
        super("Phaser", Material.FEATHER, Rarity.LEGENDARY, ItemType.OTHER);
        super.addLoreLine("&cThe Ghost's Touch...");
        super.addLoreLine("&bRight click to teleport a short distance.");
        super.applyMetaToStack();
    }
}