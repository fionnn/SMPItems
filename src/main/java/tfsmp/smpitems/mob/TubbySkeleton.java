package tfsmp.smpitems.mob;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import tfsmp.smpitems.item.BoneSword;

public class TubbySkeleton extends CustomMob
{
    public TubbySkeleton()
    {
        super(EntityType.SKELETON, ChatColor.GOLD + "Tubby Skeleton");
        super.setHoldableItem(new BoneSword());
        super.setHelmet(new ItemStack(Material.IRON_HELMET));
        super.setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
        super.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        super.setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
        super.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9999999, 5));
        super.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 2));
    }
}