package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class Fionn extends CustomItem
{
    public Fionn()
    {
        super(ChatColor.YELLOW + "gay fish", Material.PUFFERFISH, Rarity.SPECIAL);
        super.addLoreLine("&chi my name is fionn");
        super.addEnchant(Enchantment.KNOCKBACK, 10);
        super.applyMetaToStack();
    }
}