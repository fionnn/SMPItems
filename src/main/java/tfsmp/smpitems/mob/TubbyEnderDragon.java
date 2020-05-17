package tfsmp.smpitems.mob;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.EntityType;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.util.SUtil;

@SuppressWarnings("deprecation")
public class TubbyEnderDragon extends CustomMob
{
    private static SMPItems plugin = SMPItems.getPlugin(SMPItems.class);
    private static World endWorld = Bukkit.getWorld(plugin.config.getString("server.ender_dragon.end_world"));

    @Getter
    private ArmorStand title;

    @Getter
    private ArmorStand health;

    public TubbyEnderDragon()
    {
        super(EntityType.ENDER_DRAGON, ChatColor.DARK_PURPLE + "Tubby Ender Dragon");
        super.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 30));
        super.setPhase(EnderDragon.Phase.CIRCLING);
    }

    public void init()
    {
        getEntity().setMaxHealth(500.0);
        getEntity().setHealth(getEntity().getMaxHealth());
        title = (ArmorStand) endWorld.spawnEntity(new Location(endWorld, 0.5, 67.1, 0.5), EntityType.ARMOR_STAND);
        title.setCustomName(SUtil.color("&5&lTUBBY ENDER DRAGON"));
        title.setCustomNameVisible(true);
        title.setInvulnerable(true);
        title.setVisible(false);
        title.setGravity(false);
        health = (ArmorStand) endWorld.spawnEntity(new Location(endWorld, 0.5, 66.75, 0.5), EntityType.ARMOR_STAND);
        health.setCustomName(SUtil.color("&dHealth: " + (int) getEntity().getHealth() + "/" + (int) getEntity().getMaxHealth()));
        health.setCustomNameVisible(true);
        health.setInvulnerable(true);
        health.setVisible(false);
        health.setGravity(false);
    }
}