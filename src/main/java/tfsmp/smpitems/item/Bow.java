package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Bow extends CustomItem
{
    public Bow()
    {
        super("Old Bow", Material.BOW, Rarity.RARE, ItemType.RANGED);
        super.addLoreLine("&f5 Punch");
        super.addEnchant(Enchantment.ARROW_KNOCKBACK, 5);
        super.applyMetaToStack();
    }
}