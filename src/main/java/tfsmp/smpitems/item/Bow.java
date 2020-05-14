package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Bow extends CustomItem
{
    public Bow()
    {

        super("Bow", Material.BOW, Rarity.COMMON, ItemType.RANGED);
        super.setColor(ChatColor.WHITE);
        super.addLoreLine("&fPunch 3");
        super.addEnchant(Enchantment.ARROW_KNOCKBACK, 3);
        super.applyMetaToStack();
    }
}