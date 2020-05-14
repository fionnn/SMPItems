package tfsmp.smpitems.item.variant;

import org.bukkit.enchantments.Enchantment;

public class Forceful extends Variant
{
    public Forceful()
    {
        super("Forceful");
        super.addEnchant(Enchantment.ARROW_KNOCKBACK, 2);
    }
}