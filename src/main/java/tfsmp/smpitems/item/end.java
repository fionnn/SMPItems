package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class end extends CustomItem
{
    public end()
    {
        super(ChatColor.GOLD + "End?", Groups.VANILLA_SWORDS, Rarity.LEGENDARY);
        super.addLoreLine("&cThe End.");
        super.addLoreLine("&fSharpness 10");
        super.addEnchant(Enchantment.DAMAGE_ALL, 10);
        super.applyMetaToStack();
    }
}