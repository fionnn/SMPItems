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

        int midgetSpawnRate = plugin.config.getInt("server.mobs.spawnrate.midget");
        int zombieSpawnRate = plugin.config.getInt("server.mobs.spawnrate.zombie");
        int skeletonSpawnRate = plugin.config.getInt("server.mobs.spawnrate.skeleton");
        int endermanSpawnRate = plugin.config.getInt("server.mobs.spawnrate.enderman");
        int witherskeletonSpawnRate = plugin.config.getInt("server.mobs.spawnrate.witherskeleton");
        int straySpawnRate = plugin.config.getInt("server.mobs.spawnrate.stray");

        // Mobs that are able to spawn in the overworld
        if (entity.getWorld().getEnvironment().equals(World.Environment.NORMAL))
        {
            if (entity instanceof ZombieVillager && SUtil.gotRandom(midgetSpawnRate))
            {
                new TubbyLootMidget().spawn(entity, true);
                return;
            }
            if (entity instanceof Zombie && SUtil.gotRandom(zombieSpawnRate))
            {
                new TubbyZombie().spawn(entity, true);
                return;
            }
            if (entity instanceof Skeleton && SUtil.gotRandom(skeletonSpawnRate))
            {
                new TubbySkeleton().spawn(entity, true);
                return;
            }
            if (entity instanceof Enderman && SUtil.gotRandom(endermanSpawnRate))
            {
                new TubbyEnderman().spawn(entity, true);
                return;
            }
            if (entity instanceof Stray && SUtil.gotRandom(straySpawnRate))
            {
                new TubbyStray().spawn(entity, true);
                return;
            }
        }

        // Mobs that are able to spawn in the Nether
        if (entity.getWorld().getEnvironment().equals(World.Environment.NETHER))
        {
            if (entity instanceof WitherSkeleton && SUtil.gotRandom(witherskeletonSpawnRate))
            {
                new TubbyWitherSkeleton().spawn(entity, true);
            }
            if (entity instanceof Enderman && SUtil.gotRandom(endermanSpawnRate))
            {
                new TubbyEnderman().spawn(entity, true);
            }
        }
    }
}