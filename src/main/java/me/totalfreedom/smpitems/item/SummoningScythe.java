package me.totalfreedom.smpitems.item;

import org.bukkit.Material;

public class SummoningScythe extends CustomItem
{
    public SummoningScythe()
    {
        super("Summoning Scythe", Material.DIAMOND_HOE, Rarity.PEARLESCENT, ItemType.OTHER);
        super.addLoreLine("&cThe power of the underworld pulsates.");
        super.addLoreLine("&b&oRight click to summon a large amount of mobs.");
        super.applyMetaToStack();
    }
}