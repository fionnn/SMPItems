package me.totalfreedom.smpitems.item;

import me.totalfreedom.smpitems.util.Groups;
import org.bukkit.enchantments.Enchantment;

public class PickL extends CustomItem
{
    public PickL()
    {
        super("Pick!", Groups.VANILLA_PICKAXES, Rarity.RARE, ItemType.TOOLS);
        super.addLoreLine("&bEfficiency 4");
        super.addEnchant(Enchantment.DIG_SPEED, 4);
        super.applyMetaToStack();
    }
}