package me.totalfreedom.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Fionn extends CustomItem
{
    public Fionn()
    {
        super("sexy fish", Material.PUFFERFISH, Rarity.SPECIAL, ItemType.OTHER);
        super.addLoreLine("&chi my name is fionn, i'm really cool!");
        super.addLoreLine("&e&oKnockback 10");
        super.addEnchant(Enchantment.KNOCKBACK, 10);
        super.applyMetaToStack();
    }
}
