package tfsmp.smpitems.mob;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.CustomItem;

import java.util.ArrayList;
import java.util.List;

public class CustomMob
{
    private static SMPItems plugin = SMPItems.getPlugin(SMPItems.class);

    // our actual mob
    private EntityType type;

    // name of the mob
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

    public void spawn(Entity entity, boolean bc)
    {
        LivingEntity spawning = (LivingEntity) entity.getLocation().getWorld().spawnEntity(entity.getLocation().add(0.5, 0, 0.5), type);
        if (bc)
            Bukkit.broadcastMessage(ChatColor.YELLOW + "A " + ChatColor.GOLD + name + " " +
                ChatColor.YELLOW + "has spawned at " + ChatColor.GOLD + spawning.getLocation().getBlockX() + ", " +
                spawning.getLocation().getBlockY() + ", " + spawning.getLocation().getBlockZ() + ChatColor.YELLOW + " in world " + ChatColor.GOLD + spawning.getWorld().getName() + ChatColor.YELLOW + "!");
        if (this.isBaby() && (spawning instanceof Zombie))
            ((Zombie) spawning).setBaby(true);
        spawning.setCustomName(name);
        if (holdableItem != null)
            spawning.getEquipment().setItemInMainHand(holdableItem.getStack());
        if (helmet != null)
            spawning.getEquipment().setHelmet(helmet);
        if (chestplate != null)
            spawning.getEquipment().setChestplate(chestplate);
        if (leggings != null)
            spawning.getEquipment().setLeggings(leggings);
        if (boots != null)
            spawning.getEquipment().setBoots(boots);
        for (PotionEffect effect : potionEffects)
        {
            spawning.addPotionEffect(effect);
        }
    }
}