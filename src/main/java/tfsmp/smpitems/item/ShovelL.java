package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class ShovelL extends CustomItem
{
    public ShovelL()
    {
        super("Shovel!", Groups.VANILLA_SHOVELS, Rarity.RARE, ItemType.TOOLS);
        super.setColor(ChatColor.BLUE);
        super.addLoreLine("&f4 Efficiency");
        super.addEnchant(Enchantment.DIG_SPEED, 4);
        super.applyMetaToStack();
    }
}