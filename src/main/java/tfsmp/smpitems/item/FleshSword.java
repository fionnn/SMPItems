package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class FleshSword extends CustomItem
{
    public FleshSword()
    {
        super(ChatColor.GREEN + "Flesh Sword", Material.STONE_SWORD, Rarity.UNCOMMON);
        super.addLoreLine("&f+500% Knockback");
        super.addEnchant(Enchantment.KNOCKBACK, 5);
        super.applyMetaToStack();
    }
}