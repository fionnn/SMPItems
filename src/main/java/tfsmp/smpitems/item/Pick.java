package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Pick extends CustomItem
{
    public Pick()
    {
        super("Pick?", Material.GOLDEN_PICKAXE, Rarity.UNCOMMON);
        super.addLoreLine("&f3 Efficiency");
        super.addEnchant(Enchantment.DIG_SPEED, 3);
        super.applyMetaToStack();
    }
}