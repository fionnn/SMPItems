package tfsmp.smpitems.mob;

import org.bukkit.entity.Enderman;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Zombie;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.*;

import java.util.Random;

public class MobDrop implements Listener
{
    private SMPItems plugin;

    public MobDrop(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    private final Random r = new Random();

    @EventHandler
    public void onEntityDeath(EntityDeathEvent e)
    {
        if (e.getEntity().getCustomName() == null)
            return;

        if (e.getEntity() instanceof Zombie)
        {
            zombie(e);
            return;
        }

        if (e.getEntity() instanceof Skeleton)
        {
            skeleton(e);
            return;
        }

        if (e.getEntity() instanceof Enderman)
        {
            enderman(e);
            return;
        }
    }

    private void zombie(EntityDeathEvent e)
    {
        if (e.getEntity().getCustomName().contains("Tubby Zombie"))
        {
            for (int i = 0; i < 2; i++)
            {
                RandomCollection<CustomItem> items = new RandomCollection<>();
                items.add(40, new LongBow());
                items.add(40, new Bow());
                items.add(40, new Sword());
                items.add(40, new Shovel());
                items.add(40, new Hoe());
                items.add(30, new OlSturdy());
                items.add(30, new Pick());
                items.add(30, new dahoe());
                items.add(30, new FleshSword());
                items.add(30, new BoneSword());
                items.add(20, new Axe());
                items.add(20, new FreedomAxe());
                items.add(20, new FreedomBow());
                items.add(20, new FreedomSword());
                items.add(20, new FreedomPick());
                items.add(20, new PickL());
                items.add(20, new ShovelL());
                items.add(10, new SpeedStick());
                items.add(10, new SharpStick());
                items.add(5, new spoon());
                items.add(5, new drill());
                items.add(5, new POWbow());
                items.add(2, new luckypick());
                items.add(2, new Fionn());
                items.add(2, new Speed());
                items.add(2, new Super());
                items.add(2, new Ron());
                items.add(2, new Square());

                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
        if (e.getEntity().getCustomName().contains("Tubby Loot Midget"))
        {
            for (int i = 0; i < 2; i++)
            {
                RandomCollection<CustomItem> items = new RandomCollection<>();
                items.add(40, new LongBow());
                items.add(40, new Bow());
                items.add(40, new Sword());
                items.add(40, new Shovel());
                items.add(40, new Hoe());
                items.add(35, new OlSturdy());
                items.add(35, new Pick());
                items.add(35, new dahoe());
                items.add(25, new FleshSword());
                items.add(35, new BoneSword());
                items.add(25, new Axe());
                items.add(25, new FreedomAxe());
                items.add(25, new FreedomBow());
                items.add(25, new FreedomSword());
                items.add(25, new FreedomPick());
                items.add(25, new PickL());
                items.add(25, new ShovelL());
                items.add(15, new SpeedStick());
                items.add(15, new SharpStick());
                items.add(7, new spoon());
                items.add(7, new drill());
                items.add(2, new POWbow());
                items.add(7, new luckypick());
                items.add(5, new Fionn());
                items.add(5, new Speed());
                items.add(5, new Super());
                items.add(5, new Ron());
                items.add(5, new Square());
                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
    }

    private void skeleton(EntityDeathEvent e)
    {
        if (e.getEntity().getCustomName().contains("Tubby Skeleton"))
        {
            for (int i = 0; i < 2; i++)
            {
                RandomCollection<CustomItem> items = new RandomCollection<>();
                items.add(40, new LongBow());
                items.add(40, new Bow());
                items.add(40, new Sword());
                items.add(40, new Shovel());
                items.add(40, new Hoe());
                items.add(30, new OlSturdy());
                items.add(30, new Pick());
                items.add(30, new dahoe());
                items.add(20, new FleshSword());
                items.add(35, new BoneSword());
                items.add(20, new Axe());
                items.add(20, new FreedomAxe());
                items.add(20, new FreedomBow());
                items.add(20, new FreedomSword());
                items.add(20, new FreedomPick());
                items.add(20, new PickL());
                items.add(20, new ShovelL());
                items.add(10, new SpeedStick());
                items.add(10, new SharpStick());
                items.add(5, new spoon());
                items.add(5, new drill());
                items.add(5, new POWbow());
                items.add(2, new luckypick());
                items.add(2, new Fionn());
                items.add(2, new Speed());
                items.add(2, new Super());
                items.add(2, new Ron());
                items.add(2, new Square());
                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
        if (e.getEntity().getCustomName().contains("Tubby Wither Skeleton"))
        {
            for (int i = 0; i < 2; i++)
            {
                RandomCollection<CustomItem> items = new RandomCollection<>();
                items.add(40, new LongBow());
                items.add(40, new Bow());
                items.add(40, new Sword());
                items.add(40, new Shovel());
                items.add(40, new Hoe());
                items.add(30, new OlSturdy());
                items.add(30, new Pick());
                items.add(30, new dahoe());
                items.add(20, new FleshSword());
                items.add(35, new BoneSword());
                items.add(20, new Axe());
                items.add(20, new FreedomAxe());
                items.add(20, new FreedomBow());
                items.add(20, new FreedomSword());
                items.add(20, new FreedomPick());
                items.add(20, new PickL());
                items.add(20, new ShovelL());
                items.add(10, new SpeedStick());
                items.add(10, new SharpStick());
                items.add(5, new spoon());
                items.add(5, new WitherAxe());
                items.add(5, new drill());
                items.add(5, new POWbow());
                items.add(2, new luckypick());
                items.add(2, new Fionn());
                items.add(2, new Speed());
                items.add(2, new Super());
                items.add(2, new Ron());
                items.add(2, new Square());
                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
    }

    private void enderman(EntityDeathEvent e)
    {
        if (e.getEntity().getCustomName().contains("Tubby Enderman"))
        {
            for (int i = 0; i < 2; i++)
            {
                RandomCollection<CustomItem> items = new RandomCollection<>();
                items.add(3, new End());
                items.add(7, new ObsidianPick());
                items.add(10, new WitherAxe());
                items.add(30, new BoneSword());
                items.add(50, new Axe());
                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
    }
}