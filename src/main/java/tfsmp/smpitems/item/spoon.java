package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class spoon extends CustomItem
{
    public spoon()
    {
        super("spoon", Groups.VANILLA_SHOVELS, Rarity.LEGENDARY);
        super.addLoreLine("&cwait this is not a spoon?");
        super.addLoreLine("&f20 Efficiency");
        super.addLoreLine("&f10 Unbreaking");
        super.addEnchant(Enchantment.DURABILITY, 10);
        super.addEnchant(Enchantment.DIG_SPEED, 20);
        super.applyMetaToStack();
    }
}