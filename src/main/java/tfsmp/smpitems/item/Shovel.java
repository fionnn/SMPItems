package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class Shovel extends CustomItem
{
    public Shovel()
    {
        super("Shovel", Groups.VANILLA_SHOVELS, Rarity.COMMON, ItemType.TOOLS);
        super.setColor(ChatColor.WHITE);
        super.addLoreLine("&f2 Unbreaking");
        super.addEnchant(Enchantment.DURABILITY, 2);
        super.applyMetaToStack();
    }
}