package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class end extends CustomItem
{
    public end()
    {
        super("End?", Material.DIAMOND_SWORD, Rarity.LEGENDARY);
        super.addLoreLine("&cThe End.");
        super.addLoreLine("&f20 Sharpness");
        super.addLoreLine("&f+500% Damage");
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 5.0);
        super.addEnchant(Enchantment.DAMAGE_ALL, 20);
        super.applyMetaToStack();
    }
}