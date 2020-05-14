package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class WitherAxe extends CustomItem
{
    public WitherAxe()
    {
        super("Wither Axe", Groups.VANILLA_AXES, Rarity.LEGENDARY);
        super.addLoreLine("&cThe tip withers...");
        super.addLoreLine("&f10 Efficiency");
        super.addEnchant(Enchantment.DIG_SPEED, 10);
        super.applyMetaToStack();
    }
}