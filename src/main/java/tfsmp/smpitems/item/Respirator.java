package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class Respirator extends CustomItem
{
    public Respirator()
    {
        super("Respirator", Material.TURTLE_HELMET, Rarity.EPIC, ItemType.ARMOR);
        super.addLoreLine("&dAqua Affinity");
        super.addLoreLine("&dRespiration 1000");
        super.addEnchant(Enchantment.WATER_WORKER, 1);
        super.addEnchant(Enchantment.OXYGEN, 1000);
        super.applyMetaToStack();
    }
}