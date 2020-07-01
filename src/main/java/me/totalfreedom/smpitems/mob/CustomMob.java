package me.totalfreedom.smpitems.mob;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import me.totalfreedom.smpitems.SBase;
import me.totalfreedom.smpitems.item.CustomItem;

import java.util.ArrayList;
import java.util.List;

public class CustomMob extends SBase
{
    // the mob type
    private EntityType type;

    // the actual mob
    @Getter
    private LivingEntity entity;

    // name of the mob
    @Getter
    private String name;

    // item that they hold
    @Getter
    @Setter
    private CustomItem holdableItem;

    // armor
    @Getter
    @Setter
    private ItemStack helmet;
    @Getter
    @Setter
    private ItemStack chestplate;
    @Getter
    @Setter
    private ItemStack leggings;
    @Getter
    @Setter
    private ItemStack boots;

    // potion effects
    private List<PotionEffect> potionEffects;

    // baby?
    @Getter
    @Setter
    private boolean baby;

    // powered?
    @Getter
    @Setter
    private boolean powered;

    // phase on spawn (ender dragons only)
    @Getter
    @Setter
    private EnderDragon.Phase phase;

    public CustomMob(EntityType type, String name)
    {
        this.type = type;
        this.name = name;
        this.potionEffects = new ArrayList<>();
    }

    public void addPotionEffect(PotionEffect potionEffect)
    {
        potionEffects.add(potionEffect);
    }

    public void spawn(Location location, boolean bc)
    {
        this.entity = (LivingEntity) location.getWorld().spawnEntity(location.add(0.5, 0, 0.5), type);

        if (bc)
        {
            for (Player player : Bukkit.getOnlinePlayers())
            {
                boolean show = false;
                if (plugin.players.contains(player.getName().toLowerCase()))
                    show = plugin.players.getBoolean(player.getName().toLowerCase() + ".tubby");
                if (show)
                {
                    Bukkit.broadcastMessage(ChatColor.YELLOW + "A " + ChatColor.GOLD + name + " " +
                            ChatColor.YELLOW + "has spawned at " + ChatColor.GOLD + entity.getLocation().getBlockX() + ", " +
                            entity.getLocation().getBlockY() + ", " + entity.getLocation().getBlockZ() + ChatColor.YELLOW + " in world " + ChatColor.GOLD + entity.getWorld().getName() + ChatColor.YELLOW + "!");
                }
            }
        }

        if (this.isBaby() && (entity instanceof Zombie))
        {
            ((Zombie) entity).setBaby(true);
        }

        if (this.isPowered() && entity instanceof Creeper)
        {
            ((Creeper) entity).setPowered(true);
        }

        if (entity instanceof EnderDragon)
        {
            if (phase != null)
            {
                ((EnderDragon) entity).setPhase(phase);
            }
            for (Player player : Bukkit.getOnlinePlayers())
            {
                if (player.getWorld().getEnvironment().equals(World.Environment.THE_END))
                {
                    ((EnderDragon) entity).getBossBar().addPlayer(player);
                }
            }
        }

        entity.setCustomName(name);
        if (holdableItem != null)
        {
            entity.getEquipment().setItemInMainHand(holdableItem.getStack());
        }

        if (helmet != null)
        {
            entity.getEquipment().setHelmet(helmet);
        }

        if (chestplate != null)
        {
            entity.getEquipment().setChestplate(chestplate);
        }

        if (leggings != null)
        {
            entity.getEquipment().setLeggings(leggings);
        }
        if (boots != null)
        {
            entity.getEquipment().setBoots(boots);
        }

        for (PotionEffect effect : potionEffects)
        {
            entity.addPotionEffect(effect);
        }
    }

    public void spawn(Entity entity, boolean bc)
    {
        spawn(entity.getLocation(), bc);
    }
}