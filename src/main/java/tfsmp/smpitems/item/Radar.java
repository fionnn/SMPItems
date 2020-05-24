package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class Radar extends CustomItem
{
    public Radar()
    {
        super("Radar", Material.REDSTONE_LAMP, Rarity.PEARLESCENT, ItemType.OTHER);
        super.addLoreLine("&cBeep. Beep.");
        super.addLoreLine("&fRight click to scan for entities.");
        super.applyMetaToStack();
    }
}
