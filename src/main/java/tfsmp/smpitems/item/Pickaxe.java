package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Pickaxe extends CustomItem
{
    public Pickaxe()
    {
        super("Pickaxe", Material.IRON_PICKAXE, Rarity.COMMON);
        super.addLoreLine("&f2 Unbreaking")
        super.addEnchant(Enchantment.DURABILITY, 2);
        super.applyMetaToStack();
    }
}