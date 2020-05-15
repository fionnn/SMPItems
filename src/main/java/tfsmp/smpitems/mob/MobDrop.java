package tfsmp.smpitems.mob;

import org.bukkit.entity.Enderman;
import org.bukkit.entity.Skeleton;
import org.bukkit.entity.Wither;
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

        if (e.getEntity() instanceof Wither)
        {
            wither(e);
            return;
        }

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
                items.add(30, new Bootns());
                items.add(30, new Leggingns());
                items.add(30, new Chesntplate());
                items.add(30, new Helmnet());
                items.add(5, new UltimatiumBoots());
                items.add(5, new UltimatiumLeggings());
                items.add(5, new UltimatiumChest());
                items.add(5, new UltimatiumHelmet());
                items.add(5, new Bee());
                items.add(5, new TurtleShield());
                items.add(20, new Boots());
                items.add(20, new Jeans());
                items.add(20, new Shirt());
                items.add(20, new Hat());
                items.add(30, new Protector());
                items.add(40, new Shield());
                items.add(30, new OlSturdy());
                items.add(30, new Pick());
                items.add(30, new DaHoe());
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
                items.add(5, new Spoon());
                items.add(5, new Drill());
                items.add(5, new POWbow());
                items.add(2, new LuckyPick());

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
                items.add(30, new Bootns());
                items.add(30, new Leggingns());
                items.add(30, new Chesntplate());
                items.add(30, new Helmnet());
                items.add(5, new UltimatiumBoots());
                items.add(5, new UltimatiumLeggings());
                items.add(5, new UltimatiumChest());
                items.add(5, new UltimatiumHelmet());
                items.add(5, new Bee());
                items.add(5, new TurtleShield());
                items.add(20, new Boots());
                items.add(20, new Jeans());
                items.add(20, new Shirt());
                items.add(20, new Hat());
                items.add(30, new Protector());
                items.add(40, new Shield());
                items.add(35, new OlSturdy());
                items.add(35, new Pick());
                items.add(35, new DaHoe());
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
                items.add(7, new Spoon());
                items.add(7, new Drill());
                items.add(2, new POWbow());
                items.add(7, new LuckyPick());

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
                items.add(30, new Bootns());
                items.add(30, new Leggingns());
                items.add(30, new Chesntplate());
                items.add(30, new Helmnet());
                items.add(5, new UltimatiumBoots());
                items.add(5, new UltimatiumLeggings());
                items.add(5, new UltimatiumChest());
                items.add(5, new UltimatiumHelmet());
                items.add(5, new Bee());
                items.add(5, new TurtleShield());
                items.add(20, new Boots());
                items.add(20, new Jeans());
                items.add(20, new Shirt());
                items.add(20, new Hat());
                items.add(30, new Protector());
                items.add(40, new Shield());
                items.add(30, new OlSturdy());
                items.add(30, new Pick());
                items.add(30, new DaHoe());
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
                items.add(5, new Spoon());
                items.add(5, new Drill());
                items.add(5, new POWbow());
                items.add(2, new LuckyPick());

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
                items.add(30, new Bootns());
                items.add(30, new Leggingns());
                items.add(30, new Chesntplate());
                items.add(30, new Helmnet());
                items.add(5, new UltimatiumBoots());
                items.add(5, new UltimatiumLeggings());
                items.add(5, new UltimatiumChest());
                items.add(5, new UltimatiumHelmet());
                items.add(5, new Bee());
                items.add(5, new TurtleShield());
                items.add(20, new Boots());
                items.add(20, new Jeans());
                items.add(20, new Shirt());
                items.add(20, new Hat());
                items.add(30, new Protector());
                items.add(40, new Shield());
                items.add(30, new OlSturdy());
                items.add(30, new Pick());
                items.add(30, new DaHoe());
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
                items.add(5, new Spoon());
                items.add(5, new WitherAxe());
                items.add(5, new Drill());
                items.add(5, new POWbow());
                items.add(2, new LuckyPick());

                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
        if (e.getEntity().getCustomName().contains("Tubby Stray"))
        {
            for (int i = 0; i < 2; i++)
            {
                RandomCollection<CustomItem> items = new RandomCollection<>();
                items.add(40, new LongBow());
                items.add(40, new Bow());
                items.add(40, new Sword());
                items.add(40, new Shovel());
                items.add(40, new Hoe());
                items.add(30, new Bootns());
                items.add(30, new Leggingns());
                items.add(30, new Chesntplate());
                items.add(30, new Helmnet());
                items.add(5, new UltimatiumBoots());
                items.add(5, new UltimatiumLeggings());
                items.add(5, new UltimatiumChest());
                items.add(5, new UltimatiumHelmet());
                items.add(5, new Bee());
                items.add(5, new TurtleShield());
                items.add(20, new Boots());
                items.add(20, new Jeans());
                items.add(20, new Shirt());
                items.add(20, new Hat());
                items.add(30, new Protector());
                items.add(40, new Shield());
                items.add(30, new OlSturdy());
                items.add(30, new Pick());
                items.add(30, new DaHoe());
                items.add(20, new FleshSword());
                items.add(35, new BoneSword());
                items.add(20, new Axe());
                items.add(20, new FreedomAxe());
                items.add(20, new FreedomBow());
                items.add(30, new FreedomSword());
                items.add(20, new FreedomPick());
                items.add(15, new PickL());
                items.add(20, new ShovelL());
                items.add(5, new SpeedStick());
                items.add(10, new SharpStick());
                items.add(5, new Spoon());
                items.add(5, new WitherAxe());
                items.add(5, new Drill());
                items.add(5, new POWbow());
                items.add(2, new LuckyPick());

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
                items.add(40, new LongBow());
                items.add(40, new Bow());
                items.add(40, new Sword());
                items.add(40, new Shovel());
                items.add(40, new Hoe());
                items.add(30, new Bootns());
                items.add(30, new Leggingns());
                items.add(30, new Chesntplate());
                items.add(30, new Helmnet());
                items.add(5, new UltimatiumBoots());
                items.add(5, new UltimatiumLeggings());
                items.add(5, new UltimatiumChest());
                items.add(5, new UltimatiumHelmet());
                items.add(5, new Bee());
                items.add(5, new TurtleShield());
                items.add(20, new Boots());
                items.add(20, new Jeans());
                items.add(20, new Shirt());
                items.add(20, new Hat());
                items.add(30, new Protector());
                items.add(40, new Shield());
                items.add(30, new OlSturdy());
                items.add(30, new Pick());
                items.add(30, new DaHoe());
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
                items.add(10, new ObsidianPick());
                items.add(5, new Spoon());
                items.add(5, new WitherAxe());
                items.add(5, new Drill());
                items.add(5, new End());
                items.add(2, new LuckyPick());

                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
    }

    public void wither(EntityDeathEvent e)
    {
        RandomCollection<CustomItem> items = new RandomCollection<>();
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
        items.add(10, new ObsidianPick());
        items.add(5, new Spoon());
        items.add(10, new WitherAxe());
        items.add(5, new Drill());
        items.add(2, new LuckyPick());
        items.add(10, new Flux());
        items.add(10, new POWbow());
        items.add(5, new UltimatiumBoots());
        items.add(5, new UltimatiumLeggings());
        items.add(5, new UltimatiumChest());
        items.add(5, new UltimatiumHelmet());
        items.add(5, new Bee());
        items.add(5, new TurtleShield());
        CustomItem item = items.next();
        e.getDrops().add(item.getStack());
    }
}