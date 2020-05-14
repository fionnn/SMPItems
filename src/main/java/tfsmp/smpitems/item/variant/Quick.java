package tfsmp.smpitems.item.variant;

import org.bukkit.enchantments.Enchantment;

public class Quick extends Variant
{
    public Quick()
    {
        super("Quick");
        super.addEnchant(Enchantment.DIG_SPEED, 3);
    }
}