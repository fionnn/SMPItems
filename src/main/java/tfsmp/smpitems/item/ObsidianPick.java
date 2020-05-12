package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class ObsidianPick extends CustomItem
{
    public ObsidianPick()
    {
        super("Obsidian Pick", Material.DIAMOND_PICKAXE, Rarity.LEGENDARY);
        super.addLoreLine('&c"It is my lucky day!"')
        super.addLoreLine("&f10 Fortune")
        super.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10);
        super.applyMetaToStack();
    }
}