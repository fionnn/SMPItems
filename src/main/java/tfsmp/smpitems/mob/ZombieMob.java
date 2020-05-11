package tfsmp.smpitems.mob;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import tfsmp.smpitems.SMPItems;

import java.util.Random;

public class ZombieMob implements Listener
{

    private SMPItems plugin;

    public ZombieMob(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void zombieSpawnEvent(EntitySpawnEvent event)
    {
        Entity entity = event.getEntity();
        if (entity instanceof Zombie)
        {
            Random rand = new Random();
            int spawnChance = rand.nextInt(50);
            if (spawnChance == 1)
            {
                Zombie zombie = entity.getLocation().getWorld().spawn(entity.getLocation().add(0.5, 0, 0.5), Zombie.class);
                Bukkit.broadcastMessage(ChatColor.YELLOW + "A " + ChatColor.GOLD + "Tubby Zombie " +
                        ChatColor.YELLOW + "has spawned at " + ChatColor.GOLD + zombie.getLocation().getBlockX() + ", " +
                            zombie.getLocation().getBlockY() + ", " + zombie.getLocation().getBlockZ() + ChatColor.YELLOW + "!");
                zombie.setCustomName("Tubby Zombie");
                zombie.getEquipment().setItemInMainHand(new ItemStack(Material.IRON_AXE));
                zombie.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
                zombie.getEquipment().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
                zombie.getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
                zombie.getEquipment().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
                zombie.setMetadata("Tubby Zombie", new FixedMetadataValue(plugin, "Tubby Zombie"));
            }
        }
    }
}