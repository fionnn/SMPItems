package tfsmp.smpitems.item;

import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class ShovelL extends CustomItem
{
    public ShovelL()
    {
        super("Shovel!", Groups.VANILLA_SHOVELS, Rarity.RARE, ItemType.TOOLS);
        super.addLoreLine("&a&oEfficiency 4");
        super.addEnchant(Enchantment.DIG_SPEED, 4);
        super.applyMetaToStack();
    }
}