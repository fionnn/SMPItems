package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class Sword extends CustomItem
{
    public Sword()
    {
        super(ChatColor.WHITE + "Sword", Groups.VANILLA_SWORDS, Rarity.COMMON);
        super.addLoreLine("&f2 Unbreaking");
        super.addEnchant(Enchantment.DURABILITY, 2);
        super.applyMetaToStack();
    }
}