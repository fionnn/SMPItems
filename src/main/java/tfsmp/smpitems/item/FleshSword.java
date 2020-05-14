package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class FleshSword extends CustomItem
{
    public FleshSword()
    {
        super("Flesh Sword", Material.STONE_SWORD, Rarity.UNCOMMON, ItemType.MELEE);
        super.setColor(ChatColor.GREEN);
        super.addLoreLine("&f+500% Knockback");
        super.addEnchant(Enchantment.KNOCKBACK, 5);
        super.applyMetaToStack();
    }
}