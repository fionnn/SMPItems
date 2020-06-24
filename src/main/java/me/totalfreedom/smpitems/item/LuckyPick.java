package me.totalfreedom.smpitems.item;

import me.totalfreedom.smpitems.util.Groups;
import org.bukkit.enchantments.Enchantment;

public class LuckyPick extends CustomItem
{
    public LuckyPick()
    {
        super( "Lucky Pick", Groups.VANILLA_PICKAXES, Rarity.LEGENDARY, ItemType.TOOLS);
        super.addLoreLine("&cToday's my lucky day!");
        super.addLoreLine("&eFortune 10");
        super.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10);
        super.applyMetaToStack();
    }
}