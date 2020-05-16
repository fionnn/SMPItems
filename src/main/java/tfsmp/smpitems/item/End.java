package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;

public class End extends CustomItem
{
    public End()
    {
        super("End?", Material.DIAMOND_SWORD, Rarity.LEGENDARY, ItemType.MELEE);
        super.addLoreLine("&cThe End.");
        super.addLoreLine("&eSharpness 10");
        super.addLoreLine("&f+500% Damage");
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 5, AttributeModifier.Operation.ADD_SCALAR);
        super.addEnchant(Enchantment.DAMAGE_ALL, 10);
        super.applyMetaToStack();
    }
}   