package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Speed extends CustomItem
{
    public Speed()
    {
        super("speedn", Material.COOKED_COD, Rarity.SPECIAL, ItemType.OTHER);
        super.addLoreLine("&csepeed");
        super.addLoreLine("&e&oKnockback 10");
        super.addEnchant(Enchantment.KNOCKBACK, 10);
        super.applyMetaToStack();
    }
}