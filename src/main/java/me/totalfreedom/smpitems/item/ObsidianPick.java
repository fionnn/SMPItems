package me.totalfreedom.smpitems.item;

import org.bukkit.enchantments.Enchantment;
import me.totalfreedom.smpitems.util.Groups;

public class ObsidianPick extends CustomItem
{
    public ObsidianPick()
    {
        super("Obsidian Pick", Groups.VANILLA_PICKAXES, Rarity.EPIC, ItemType.TOOLS);
        super.addLoreLine("&dUnbreaking 10");
        super.addLoreLine("&dEfficiency 6");
        super.addEnchant(Enchantment.DURABILITY, 10);
        super.addEnchant(Enchantment.DIG_SPEED, 6);
        super.applyMetaToStack();
    }
}