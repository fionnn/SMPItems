package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class Speed extends CustomItem
{
    public Speed()
    {
        super("speedn", Material.COOKED_COD, Rarity.SPECIAL);
        super.addLoreLine("&csepeed");
        super.addEnchant(Enchantment.KNOCKBACK, 10);
        super.applyMetaToStack();
    }
}