package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class MagicalSaddle extends CustomItem
{
    public MagicalSaddle()
    {
        super("Magical Saddle", Material.SADDLE, Rarity.EPIC, ItemType.OTHER);
        super.addEnchant(Enchantment.DURABILITY, 1);
        super.addLoreLine("&cRide anything you want...");
        super.applyMetaToStack();
    }
}