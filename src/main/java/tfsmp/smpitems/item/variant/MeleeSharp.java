package tfsmp.smpitems.item.variant;

import org.bukkit.enchantments.Enchantment;

public class MeleeSharp extends Variant
{
    public MeleeSharp()
    {
        super("Sharp");
        super.addEnchant(Enchantment.DAMAGE_ALL, 2);
    }
}