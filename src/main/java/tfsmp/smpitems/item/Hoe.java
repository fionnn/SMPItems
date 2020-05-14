package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class Hoe extends CustomItem
{
    public Hoe()
    {
        super(ChatColor.WHITE + "hoe", Groups.VANILLA_HOES, Rarity.COMMON);
        super.addLoreLine("&f2 Efficiency");
        super.addEnchant(Enchantment.DIG_SPEED, 2);
        super.applyMetaToStack();
    }
}