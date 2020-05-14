package tfsmp.smpitems.item.variant;

import org.bukkit.enchantments.Enchantment;

public class Lucky extends Variant
{
    public Lucky()
    {
        super("Lucky");
        super.addEnchant(Enchantment.LOOT_BONUS_MOBS, 1);
    }
}