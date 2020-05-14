package tfsmp.smpitems.item;

import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class luckypick extends CustomItem
{
    public luckypick()
    {
        super( "Lucky Pick", Groups.VANILLA_PICKAXES, Rarity.LEGENDARY, ItemType.TOOLS);
        super.addLoreLine("&f10 Fortune");
        super.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10);
        super.applyMetaToStack();
    }
}