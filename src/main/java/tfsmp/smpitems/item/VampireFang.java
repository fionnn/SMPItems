package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;

public class VampireFang extends CustomItem
{
    public VampireFang()
    {
        super("Vampire Fang", Material.GHAST_TEAR, Rarity.LEGENDARY, ItemType.MELEE);
        super.addLoreLine("&cThe blood of your prey powers you.");
        super.addLoreLine("&eSharpness 10");
        super.addLoreLine("&e+300% Damage");
        super.addEnchant(Enchantment.DAMAGE_ALL, 10);
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 3, AttributeModifier.Operation.ADD_SCALAR);
        super.applyMetaToStack();
    }
}