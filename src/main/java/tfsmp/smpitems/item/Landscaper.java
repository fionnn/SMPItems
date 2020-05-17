package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;

public class Landscaper extends CustomItem
{
    public Landscaper()
    {
        super("The Landscaper", Material.WOODEN_SWORD, Rarity.LEGENDARY, ItemType.OTHER);
        super.addLoreLine("&cDeath awaits from above.");
        super.addLoreLine("&eKnockback 20");
        super.addLoreLine("&f+200% Damage");
        super.addLoreLine("&f+25% Knockback Resistance");
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 2, AttributeModifier.Operation.ADD_SCALAR);
        super.addAttribute(Attribute.GENERIC_KNOCKBACK_RESISTANCE, 0.25, AttributeModifier.Operation.ADD_SCALAR);
        super.addEnchant(Enchantment.KNOCKBACK, 20);
        super.applyMetaToStack();
    }
}