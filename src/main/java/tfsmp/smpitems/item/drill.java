package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class drill extends CustomItem
{
    public drill()
    {
        super("Drill", Material.DIAMOND_PICKAXE, Rarity.LEGENDARY);
        super.addLoreLine("&cdrill go BRRR");
        super.addLoreLine("&f10 Efficiency");
        super.addEnchant(Enchantment.DIG_SPEED, 10);
        super.applyMetaToStack();
    }
}