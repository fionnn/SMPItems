package me.totalfreedom.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Flare extends CustomItem
{
    public Flare()
    {
        super("Flare", Material.REDSTONE_TORCH, Rarity.PEARLESCENT, ItemType.OTHER);
        super.addLoreLine("&cKeeps the mobs away!");
        super.addLoreLine("&720s Cooldown");
        super.addEnchant(Enchantment.DURABILITY, 1);
        super.applyMetaToStack();
    }
}