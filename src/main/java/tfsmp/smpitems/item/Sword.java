package tfsmp.smpitems.item;

import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class Sword extends CustomItem
{
    public Sword()
    {
        super("Sword", Groups.VANILLA_SWORDS, Rarity.COMMON, ItemType.MELEE);
        super.addLoreLine("&f2 Unbreaking");
        super.addEnchant(Enchantment.DURABILITY, 2);
        super.applyMetaToStack();
    }
}