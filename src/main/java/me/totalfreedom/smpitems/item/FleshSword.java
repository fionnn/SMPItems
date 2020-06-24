package me.totalfreedom.smpitems.item;

import me.totalfreedom.smpitems.util.Groups;
import org.bukkit.enchantments.Enchantment;

public class FleshSword extends CustomItem
{
    public FleshSword()
    {
        super("Flesh Sword", Groups.VANILLA_SWORDS, Rarity.RARE, ItemType.MELEE);
        super.addLoreLine("&bKnockback 5");
        super.addEnchant(Enchantment.KNOCKBACK, 5);
        super.applyMetaToStack();
    }
}