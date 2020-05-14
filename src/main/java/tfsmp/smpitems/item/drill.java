package tfsmp.smpitems.item;

import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class drill extends CustomItem
{
    public drill()
    {
        super("Drill", Groups.VANILLA_PICKAXES, Rarity.LEGENDARY, ItemType.TOOLS);
        super.addLoreLine("&cdrill go BRRR");
        super.addLoreLine("&f10 Efficiency");
        super.addEnchant(Enchantment.DIG_SPEED, 10);
        super.applyMetaToStack();
    }
}