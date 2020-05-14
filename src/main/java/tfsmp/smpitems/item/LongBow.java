package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class LongBow extends CustomItem
{
    public LongBow()
    {
        super("Long Bow", Material.BOW, Rarity.COMMON, ItemType.RANGED);
        super.addLoreLine("&f5 Power");
        super.addEnchant(Enchantment.ARROW_DAMAGE, 5);
        super.applyMetaToStack();
    }
}