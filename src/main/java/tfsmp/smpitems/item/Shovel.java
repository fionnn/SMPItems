package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class Shovel extends CustomItem
{
    public Shovel()
    {
        super(ChatColor.WHITE + "Shovel", Groups.VANILLA_SHOVELS, Rarity.COMMON);
        super.addLoreLine("&f2 Unbreaking");
        super.addEnchant(Enchantment.DURABILITY, 2);
        super.applyMetaToStack();
    }
}