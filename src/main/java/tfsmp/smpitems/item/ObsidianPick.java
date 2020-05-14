package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class ObsidianPick extends CustomItem
{
    public ObsidianPick()
    {
        super("Obsidian Pick", Groups.VANILLA_PICKAXES, Rarity.LEGENDARY);
        super.addLoreLine("&cIt is my lucky day!");
        super.addLoreLine("&f10 Fortune");
        super.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10);
        super.applyMetaToStack();
    }
}