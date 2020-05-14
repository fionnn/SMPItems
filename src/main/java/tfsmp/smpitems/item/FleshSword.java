package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class FleshSword extends CustomItem
{
    public FleshSword()
    {
        super(ChatColor.GREEN + "Flesh Sword", Groups.VANILLA_SWORDS, Rarity.UNCOMMON);
        super.addLoreLine("&fKnockback 5");
        super.addEnchant(Enchantment.KNOCKBACK, 5);
        super.applyMetaToStack();
    }
}