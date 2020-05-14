package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class OlSturdy extends CustomItem
{
    public OlSturdy()
    {
        super("Ol' Sturdy", Material.BOW, Rarity.UNCOMMON, ItemType.RANGED);
        super.addLoreLine("&a&oUnbreaking 5");
        super.addEnchant(Enchantment.DURABILITY, 5);
        super.applyMetaToStack();
    }
}