package tfsmp.smpitems.item;

import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class dahoe extends CustomItem
{
    public dahoe()
    {
        super("da hoe", Groups.VANILLA_HOES, Rarity.UNCOMMON);
        super.addLoreLine("&f5 Unbreaking");
        super.addEnchant(Enchantment.DURABILITY, 5);
        super.applyMetaToStack();
    }
}