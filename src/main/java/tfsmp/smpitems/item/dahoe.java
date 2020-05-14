package tfsmp.smpitems.item;


import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class dahoe extends CustomItem
{
    public dahoe()
    {
        super("da hoe", Groups.VANILLA_HOES, Rarity.UNCOMMON, ItemType.TOOLS);
        super.setColor(ChatColor.GREEN);
        super.addLoreLine("&f5 Unbreaking");
        super.addEnchant(Enchantment.DURABILITY, 5);
        super.applyMetaToStack();
    }
}