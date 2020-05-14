package tfsmp.smpitems.item;

import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class End extends CustomItem
{
    public End()
    {
        super("End?", Groups.VANILLA_SWORDS, Rarity.LEGENDARY);
        super.addLoreLine("&cThe End.");
        super.addLoreLine("&fSharpness 10");
        super.addEnchant(Enchantment.DAMAGE_ALL, 10);
        super.applyMetaToStack();
    }
}