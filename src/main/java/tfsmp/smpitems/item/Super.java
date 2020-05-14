package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Super extends CustomItem
{
    public Super()
    {
        super("clown", Material.TROPICAL_FISH, Rarity.SPECIAL, ItemType.OTHER);
        super.addLoreLine("&cmy asshole BURNS");
        super.addLoreLine("&e&oKnockback 10");
        super.addEnchant(Enchantment.KNOCKBACK, 10);
        super.applyMetaToStack();
    }
}