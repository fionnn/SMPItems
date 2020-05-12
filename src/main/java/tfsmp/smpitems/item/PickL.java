package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class PickL extends CustomItem
{
    public PickL()
    {
        super("Pick!", Material.IRON_PICKAXE, Rarity.RARE);
        super.addLoreLine("&f4 Efficiency")
        super.addEnchant(Enchantment.DIG_SPEED, 4);
        super.applyMetaToStack();
    }
}