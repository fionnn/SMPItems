package tfsmp.smpitems.item;

import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class Pick extends CustomItem
{
    public Pick()
    {
        super("Pick?", Groups.VANILLA_PICKAXES, Rarity.UNCOMMON, ItemType.TOOLS);
        super.addLoreLine("&a&oEfficiency 3");
        super.addEnchant(Enchantment.DIG_SPEED, 3);
        super.applyMetaToStack();
    }
}