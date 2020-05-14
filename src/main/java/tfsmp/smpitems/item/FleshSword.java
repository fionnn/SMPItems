package tfsmp.smpitems.item;

import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class FleshSword extends CustomItem
{
    public FleshSword()
    {
        super("Flesh Sword", Groups.VANILLA_SWORDS, Rarity.RARE, ItemType.MELEE);
        super.addLoreLine("&fKnockback 5");
        super.addEnchant(Enchantment.KNOCKBACK, 5);
        super.applyMetaToStack();
    }
}