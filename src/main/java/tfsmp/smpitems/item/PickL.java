package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class PickL extends CustomItem
{
    public PickL()
    {
        super(ChatColor.BLUE + "Pick!", Groups.VANILLA_PICKAXES, Rarity.RARE);
        super.addLoreLine("&f4 Efficiency");
        super.addEnchant(Enchantment.DIG_SPEED, 4);
        super.applyMetaToStack();
    }
}