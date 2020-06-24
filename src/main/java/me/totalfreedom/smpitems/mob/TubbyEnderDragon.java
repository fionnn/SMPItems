package me.totalfreedom.smpitems.mob;

import lombok.Getter;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.World;
import org.bukkit.boss.BarColor;
import org.bukkit.boss.BarStyle;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import me.totalfreedom.smpitems.SMPItems;
import me.totalfreedom.smpitems.util.SUtil;

@SuppressWarnings("deprecation")
public class TubbyEnderDragon extends CustomMob
{
    private static SMPItems plugin = SMPItems.getPlugin(SMPItems.class);
    private static World endWorld = SUtil.endWorld;

    @Getter
    private BossBar bossBar;

    public TubbyEnderDragon()
    {
        super(EntityType.ENDER_DRAGON, ChatColor.DARK_PURPLE + "Tubby Ender Dragon");
        super.addPotionEffect(new PotionEffect(PotionEffectType.INCREASE_DAMAGE, 9999999, 30));
        super.setPhase(EnderDragon.Phase.CIRCLING);
    }

    public void init()
    {
        getEntity().setMaxHealth(800.0);
        getEntity().setHealth(getEntity().getMaxHealth());
        bossBar = Bukkit.createBossBar(getName(), BarColor.PURPLE, BarStyle.SOLID);
        for (Player player : Bukkit.getOnlinePlayers())
        {
            if (player.getWorld() == endWorld)
            {
                bossBar.addPlayer(player);
            }
        }
    }
}