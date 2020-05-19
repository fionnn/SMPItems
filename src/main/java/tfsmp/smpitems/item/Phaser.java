package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;

public class Phaser extends CustomItem
{
    public Phaser()
    {
        super("Phaser", Material.FEATHER, Rarity.LEGENDARY, ItemType.MELEE);
        super.addLoreLine("&cThe Ghost's Touch...");
        super.addLoreLine("&bRight click to teleport a short distance.");
        super.applyMetaToStack();
    }
}