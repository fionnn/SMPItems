package me.totalfreedom.smpitems.item;

import org.bukkit.enchantments.Enchantment;
import me.totalfreedom.smpitems.util.Groups;

public class Shovel extends CustomItem
{
    public Shovel()
    {
        super("Shovel", Groups.VANILLA_SHOVELS, Rarity.COMMON, ItemType.TOOLS);
        super.addLoreLine("&fUnbreaking 2");
        super.addEnchant(Enchantment.DURABILITY, 2);
        super.applyMetaToStack();
    }
}