package tfsmp.smpitems.mob;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.WitherSkeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.metadata.FixedMetadataValue;
import tfsmp.smpitems.SMPItems;

import java.util.Random;

public class WitherSkeletonMob implements Listener
{

    private SMPItems plugin;

    public WitherSkeletonMob(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void witherSkeletonSpawnEvent(EntitySpawnEvent event)
    {
        Entity entity = event.getEntity();

        if (entity.getWorld().getEnvironment().equals(World.Environment.NETHER))
        {
            if (entity instanceof WitherSkeleton)
            {
                Random rand = new Random();
                int spawnChance = rand.nextInt(5);
                if (spawnChance == 1)
                {
                    WitherSkeleton withersk = entity.getLocation().getWorld().spawn(entity.getLocation().add(0.5, 0, 0.5), WitherSkeleton.class);
                    Bukkit.broadcastMessage(ChatColor.YELLOW + "A" + ChatColor.LIGHT_PURPLE + " Tubby Wither Skeleton " +
                            ChatColor.YELLOW + "has spawned at " + ChatColor.GOLD + withersk.getLocation().getBlockX() + ", " +
                                withersk.getLocation().getBlockY() + ", " + withersk.getLocation().getBlockZ() + ChatColor.YELLOW + " in world " + ChatColor.GOLD + withersk.getWorld().getName() + ChatColor.YELLOW + "!");

                    withersk.setCustomName(ChatColor.LIGHT_PURPLE + "Tubby Wither Skeleton");
                    ItemStack witherAxe = new ItemStack(Material.DIAMOND_AXE);
                    ItemMeta axeMeta = witherAxe.getItemMeta();
                    axeMeta.addEnchant(Enchantment.DIG_SPEED, 10, true);
                    witherAxe.setItemMeta(axeMeta);

                    withersk.getEquipment().setItemInMainHand(new ItemStack(witherAxe));
                    withersk.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
                    withersk.getEquipment().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
                    withersk.getEquipment().setLeggings(new ItemStack(Material.IRON_LEGGINGS));
                    withersk.getEquipment().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
                    withersk.setMetadata("Tubby Wither Skeleton", new FixedMetadataValue(plugin, "Tubby Wither Skeleton"));
                }
            }
        }
    }
}