package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Sword extends CustomItem
{
    public Sword()
    {
        super("Sword", Material.IRON_SWORD, Rarity.COMMON);
        super.addLoreLine("&f2 Unbreaking");
        super.addEnchant(Enchantment.DURABILITY, 2);
        super.applyMetaToStack();
    }
}