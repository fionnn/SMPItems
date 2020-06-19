package me.totalfreedom.smpitems.mob;

import me.totalfreedom.smpitems.item.Axe;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;

public class TubbyZombie extends CustomMob
{
    public TubbyZombie()
    {
        super(EntityType.ZOMBIE, ChatColor.GOLD + "Tubby Zombie");
        super.setHoldableItem(new Axe());
        super.setHelmet(new ItemStack(Material.IRON_HELMET));
        super.setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
        super.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        super.setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
    }
}