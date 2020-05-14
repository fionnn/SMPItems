package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class Super extends CustomItem
{
    public Super()
    {
        super(ChatColor.YELLOW + "clown", Material.TROPICAL_FISH, Rarity.SPECIAL);
        super.addLoreLine("&cmy asshole BURNS");
        super.addEnchant(Enchantment.KNOCKBACK, 10);
        super.applyMetaToStack();
    }
}