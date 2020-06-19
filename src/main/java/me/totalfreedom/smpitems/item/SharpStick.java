package me.totalfreedom.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class SharpStick extends CustomItem
{
    public SharpStick()
    {
        super("sharp stick!!!", Material.STICK, Rarity.EPIC, ItemType.OTHER);
        super.addLoreLine("&dSharpness 10");
        super.addEnchant(Enchantment.DAMAGE_ALL, 10);
        super.applyMetaToStack();
    }
}