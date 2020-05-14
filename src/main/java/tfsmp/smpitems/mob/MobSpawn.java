package tfsmp.smpitems.mob;

import org.bukkit.World;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntitySpawnEvent;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.util.SUtil;

public class MobSpawn implements Listener
{
    private SMPItems plugin;

    public MobSpawn(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEntitySpawn(EntitySpawnEvent event)
    {
        Entity entity = event.getEntity();

        // Mobs that are able to spawn in the overworld
        if (entity.getWorld().getEnvironment().equals(World.Environment.NORMAL))
        {
            if (entity instanceof Skeleton && SUtil.gotRandom(60))
            {
                new SkeletonMob().spawn(entity, true);
            }
            if (entity instanceof Zombie && SUtil.gotRandom(50))
            {
                new ZombieMob().spawn(entity, true);
            }
            if (entity instanceof ZombieVillager && SUtil.gotRandom(5))
            {
                new MidgetMob().spawn(entity, true);
            }
            if (entity instanceof Enderman && SUtil.gotRandom(5))
            {
                new EndermanMob().spawn(entity, true);
            }
        }

        // Mobs that are able to spawn in the Nether
        if (entity.getWorld().getEnvironment().equals(World.Environment.NETHER))
        {
            if (entity instanceof WitherSkeleton && SUtil.gotRandom(5))
            {
                new WitherSkeletonMob().spawn(entity, true);
            }
            if (entity instanceof Enderman && SUtil.gotRandom(5))
            {
                new EndermanMob().spawn(entity, true);
            }
        }
    }
}