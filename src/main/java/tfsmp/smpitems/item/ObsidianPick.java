package tfsmp.smpitems.item;

import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class ObsidianPick extends CustomItem
{
    public ObsidianPick()
    {
        super("Obsidian Pick", Groups.VANILLA_PICKAXES, Rarity.LEGENDARY);
        super.addLoreLine("&cIt is my lucky day!");
        super.addLoreLine("&fUnbreaking 10");
        super.addEnchant(Enchantment.DURABILITY, 10);
        super.applyMetaToStack();
    }
}