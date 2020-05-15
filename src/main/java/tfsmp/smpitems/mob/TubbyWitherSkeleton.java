package tfsmp.smpitems.mob;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import tfsmp.smpitems.item.WitherAxe;

public class TubbyWitherSkeleton extends CustomMob
{
    public TubbyWitherSkeleton()
    {
        super(EntityType.WITHER_SKELETON, ChatColor.LIGHT_PURPLE + "Tubby Wither Skeleton");
        super.setHoldableItem(new WitherAxe());
        super.setHelmet(new ItemStack(Material.IRON_HELMET));
        super.setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
        super.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        super.setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
    }
}