package me.totalfreedom.smpitems.mob;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import me.totalfreedom.smpitems.item.FleshSword;

public class TubbyLootMidget extends CustomMob
{
    public TubbyLootMidget()
    {
        super(EntityType.ZOMBIE_VILLAGER, ChatColor.LIGHT_PURPLE + "Tubby Loot Midget");
        super.setBaby(true);
        super.setHoldableItem(new FleshSword());
        super.setHelmet(new ItemStack(Material.IRON_HELMET));
        super.setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
        super.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        super.setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
        super.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 2));
    }
}