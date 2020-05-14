package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class ObsidianPick extends CustomItem
{
    public ObsidianPick()
    {
        super("Obsidian Pick", Groups.VANILLA_PICKAXES, Rarity.EPIC);
        super.addLoreLine("&f10 Unbreaking");
        super.addLoreLine("&f6 Efficiency");
        super.addEnchant(Enchantment.DURABILITY, 10);
        super.addEnchant(Enchantment.DIG_SPEED, 6);
        super.applyMetaToStack();
    }
}