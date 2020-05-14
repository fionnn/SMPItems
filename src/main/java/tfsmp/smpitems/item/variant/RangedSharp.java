package tfsmp.smpitems.item.variant;

import org.bukkit.enchantments.Enchantment;

public class RangedSharp extends Variant
{
    public RangedSharp()
    {
        super("Sharp");
        super.addEnchant(Enchantment.ARROW_DAMAGE, 3);
    }
}