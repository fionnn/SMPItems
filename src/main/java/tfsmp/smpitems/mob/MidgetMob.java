package tfsmp.smpitems.mob;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Zombie;
import org.bukkit.entity.ZombieVillager;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityInteractEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import tfsmp.smpitems.SMPItems;

import java.util.Random;

public class MidgetMob implements Listener
{
    private SMPItems plugin;

    public MidgetMob(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void midgetSpawnEvent(EntitySpawnEvent event)
    {
        Entity entity = event.getEntity();
        if (entity instanceof Zombie)
        {
            Random rand = new Random();
            int spawnChance = rand.nextInt(30);
            if (spawnChance == 1)
            {
                ZombieVillager villager = entity.getLocation().getWorld().spawn(entity.getLocation().add(0.5, 0, 0.5), ZombieVillager.class);
                Bukkit.broadcastMessage(ChatColor.YELLOW + "A" + ChatColor.GOLD + " Tubby Loot Midget " +
                        ChatColor.YELLOW + "has spawned at " + ChatColor.GOLD + villager.getLocation().getBlockX() + ", " +
                        villager.getLocation().getBlockY() + ", " + villager.getLocation().getBlockZ() + ChatColor.YELLOW + " in world " + ChatColor.GOLD + villager.getWorld().getName() + ChatColor.YELLOW + "!");
                villager.setCustomName("Tubby Loot Midget");
                villager.setBaby(true);
                villager.getEquipment().setItemInMainHand(new ItemStack(Material.IRON_SWORD));
                villager.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
                villager.getEquipment().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
                villager.getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
                villager.getEquipment().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
                villager.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9999999, 5));
                villager.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 2));
                villager.setMetadata("Tubby Loot Midget", new FixedMetadataValue(plugin, "Tubby Loot Midget"));
            }
        }
    }
}