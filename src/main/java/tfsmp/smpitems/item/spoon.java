package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class spoon extends CustomItem
{
    public spoon()
    {
        super("spoon", Groups.VANILLA_SHOVELS, Rarity.LEGENDARY, ItemType.TOOLS);
        super.setColor(ChatColor.GOLD);
        super.addLoreLine("&cwait this isn't a spoon?");
        super.addLoreLine("&f20 Efficiency");
        super.addLoreLine("&f10 Unbreaking");
        super.addEnchant(Enchantment.DURABILITY, 10);
        super.addEnchant(Enchantment.DIG_SPEED, 20);
        super.applyMetaToStack();
    }
}