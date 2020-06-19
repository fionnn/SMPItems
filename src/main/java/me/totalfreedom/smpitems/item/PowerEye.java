package me.totalfreedom.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class PowerEye extends CustomItem
{
    public PowerEye()
    {
        super("Power Eye", Material.ENDER_EYE, Rarity.EPIC, ItemType.OTHER);
        super.addLoreLine("&cPower to the almighty dragon!");
        super.addEnchant(Enchantment.DURABILITY, 1);
        super.applyMetaToStack();
    }
}