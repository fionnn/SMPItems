package tfsmp.smpitems.mob;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
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
            int spawnChance = rand.nextInt(30);
            if (spawnChance == 1)
            {
                Zombie zombie = entity.getLocation().getWorld().spawn(entity.getLocation().add(0.5, 0, 0.5), Zombie.class);
                Bukkit.broadcastMessage(ChatColor.YELLOW + "A tubby has spawned at " + ChatColor.GOLD + zombie.getLocation().getBlockX() + ", " +
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

    @EventHandler
    public void zombieDeathEvent(EntityDeathEvent event)
    {
        if (event.getEntity() instanceof Zombie)
        {
            if (event.getEntity().hasMetadata("Tubby Zombie"))
            {
                Random rand = new Random();
                int dropChance = rand.nextInt(5);
                if (dropChance == 1)
                {
                    ItemStack freedomAxe = new ItemStack(Material.IRON_AXE);
                    ItemMeta freedomMeta = freedomAxe.getItemMeta();
                    freedomMeta.setDisplayName(ChatColor.AQUA + "Freedom Axe");
                    freedomMeta.addAttributeModifier(Attribute.GENERIC_MOVEMENT_SPEED, new AttributeModifier("generic.movementSpeed", 1.0, AttributeModifier.Operation.MULTIPLY_SCALAR_1));
                    freedomAxe.setItemMeta(freedomMeta);
                    event.getDrops().clear();
                    event.getDrops().add(new ItemStack(freedomAxe));
                }
            }
        }
    }
}