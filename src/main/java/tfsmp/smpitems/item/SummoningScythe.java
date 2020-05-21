package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class SummoningScythe extends CustomItem
{
    public SummoningScythe()
    {
        super("Summoning Scythe", Material.DIAMOND_HOE, Rarity.PEARLESCENT, ItemType.OTHER);
        super.addLoreLine("&cThe power of the underworld pulsates.");
        super.addLoreLine("&bRight click to summon a large amount of mobs.");
        super.applyMetaToStack();
    }
}