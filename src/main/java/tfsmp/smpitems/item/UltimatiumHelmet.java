package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class UltimatiumHelmet extends CustomItem
{
    public UltimatiumHelmet()
    {
        super("Ultimatium Helmet", Material.DIAMOND_HELMET, Rarity.LEGENDARY, ItemType.ARMOR);
        super.addLoreLine("&cPower.");
        super.addLoreLine("&e+5 Health");
        super.addLoreLine("&eProtection 10");
        super.addLoreLine("&eFull Set Bonus: Flight");
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 5);
        super.addEnchant(Enchantment.PROTECTION_ENVIRONMENTAL, 10);
        super.addEnchant(Enchantment.DURABILITY, 10);
        super.applyMetaToStack();
    }
}