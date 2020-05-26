package tfsmp.smpitems.item;

import org.bukkit.Material;

public class Radar extends CustomItem
{
    public Radar()
    {
        super("Radar", Material.REDSTONE_LAMP, Rarity.PEARLESCENT, ItemType.OTHER);
        super.addLoreLine("&cBeep. Beep.");
        super.addLoreLine("&b&oRight click to scan for entities.");
        super.applyMetaToStack();
    }
}
