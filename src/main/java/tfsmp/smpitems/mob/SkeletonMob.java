package tfsmp.smpitems.mob;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import tfsmp.smpitems.SMPItems;

import java.util.Random;

public class SkeletonMob implements Listener
{
    private SMPItems plugin;

    public SkeletonMob(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void skeletonSpawnEvent(EntitySpawnEvent event)
    {
        Entity entity = event.getEntity();
        if (entity instanceof Skeleton)
        {
            Random rand = new Random();
            int spawnChance = rand.nextInt(50);
            if (spawnChance == 1)
            {
                Skeleton skeleton = entity.getLocation().getWorld().spawn(entity.getLocation().add(0.5, 0, 0.5), Skeleton.class);
                Bukkit.broadcastMessage(ChatColor.YELLOW + "A" + ChatColor.GOLD + " Tubby Skeleton " +
                        ChatColor.YELLOW + "has spawned at " + ChatColor.GOLD + skeleton.getLocation().getBlockX() + ", " +
                        skeleton.getLocation().getBlockY() + ", " + skeleton.getLocation().getBlockZ() + ChatColor.YELLOW + "!");
                skeleton.setCustomName("Tubby Skeleton");
                skeleton.getEquipment().setItemInMainHand(new ItemStack(Material.IRON_SWORD));
                skeleton.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
                skeleton.getEquipment().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
                skeleton.getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
                skeleton.getEquipment().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
                skeleton.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9999999, 5));
                skeleton.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 2));
                skeleton.setMetadata("Tubby Skeleton", new FixedMetadataValue(plugin, "Tubby Skeleton"));
            }
        }
    }
}