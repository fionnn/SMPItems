package me.totalfreedom.smpitems.mob;

import me.totalfreedom.smpitems.item.*;
import me.totalfreedom.smpitems.item.Bee;
import org.bukkit.ChatColor;
import org.bukkit.entity.*;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.scheduler.BukkitRunnable;
import me.totalfreedom.smpitems.SMPItems;

import java.util.ArrayList;
import java.util.List;
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

        if (e.getEntity() instanceof EnderDragon)
        {
            enderDragon(e);
            return;
        }

        if (e.getEntity() instanceof Enderman)
        {
            enderman(e);
            return;
        }

        if (e.getEntity() instanceof Creeper)
        {
            creeper(e);
            return;
        }

        if (e.getEntity() instanceof Spider)
        {
            spider(e);
            return;
        }
    }

    private void zombie(EntityDeathEvent e)
    {
        if (e.getEntity().getCustomName().equals(ChatColor.GOLD + "Tubby Zombie"))
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
                items.add(5, new VampireFang());
                items.add(1, new SummoningScythe());
                items.add(5, new UltimatiumHelmet());
                items.add(5, new me.totalfreedom.smpitems.item.Bee());
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
                items.add(10, new Respirator());
                items.add(10, new SpeedStick());
                items.add(10, new SharpStick());
                items.add(5, new Spoon());
                items.add(5, new Drill());
                items.add(5, new Sham());
                items.add(5, new SuperFood());
                items.add(2, new LuckyPick());
                items.add(0.2, new POWbow());
                items.add(0.01, new Landscaper());
                items.add(20, new MagicalSaddle());

                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }

        if (e.getEntity().getCustomName().equals(ChatColor.LIGHT_PURPLE + "Tubby Loot Midget"))
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
                items.add(5, new me.totalfreedom.smpitems.item.Bee());
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
                items.add(10, new Respirator());
                items.add(25, new FreedomPick());
                items.add(25, new PickL());
                items.add(25, new ShovelL());
                items.add(15, new SpeedStick());
                items.add(15, new SharpStick());
                items.add(7, new Spoon());
                items.add(7, new SuperFood());
                items.add(7, new Drill());
                items.add(7, new Sham());
                items.add(2, new POWbow());
                items.add(7, new LuckyPick());
                items.add(0.05, new Landscaper());
                items.add(20, new MagicalSaddle());

                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
    }

    private void skeleton(EntityDeathEvent e)
    {
        if (e.getEntity().getCustomName().equals(ChatColor.GOLD + "Tubby Skeleton"))
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
                items.add(5, new me.totalfreedom.smpitems.item.Bee());
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
                items.add(10, new Respirator());
                items.add(20, new FreedomBow());
                items.add(20, new FreedomSword());
                items.add(20, new FreedomPick());
                items.add(20, new PickL());
                items.add(20, new ShovelL());
                items.add(10, new SpeedStick());
                items.add(10, new SharpStick());
                items.add(5, new Spoon());
                items.add(5, new SuperFood());
                items.add(5, new Sham());
                items.add(5, new Drill());
                items.add(0.2, new POWbow());
                items.add(2, new LuckyPick());
                items.add(0.5, new TreeBow());
                items.add(0.01, new Landscaper());
                items.add(20, new MagicalSaddle());

                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }

        if (e.getEntity().getCustomName().equals(ChatColor.LIGHT_PURPLE + "Tubby Wither Skeleton"))
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
                items.add(5, new me.totalfreedom.smpitems.item.Bee());
                items.add(5, new TurtleShield());
                items.add(20, new Boots());
                items.add(20, new Jeans());
                items.add(10, new Respirator());
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
                items.add(5, new SuperFood());
                items.add(5, new WitherAxe());
                items.add(5, new Drill());
                items.add(2, new LuckyPick());
                items.add(0.5, new POWbow());
                items.add(1, new TreeBow());
                items.add(0.01, new Landscaper());
                items.add(20, new MagicalSaddle());

                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }

        if (e.getEntity().getCustomName().equals(ChatColor.LIGHT_PURPLE + "Tubby Stray"))
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
                items.add(5, new me.totalfreedom.smpitems.item.Bee());
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
                items.add(10, new Respirator());
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
                items.add(5, new SuperFood());
                items.add(5, new Drill());
                items.add(2, new LuckyPick());
                items.add(0.3, new POWbow());
                items.add(0.6, new TreeBow());
                items.add(0.01, new Landscaper());
                items.add(20, new MagicalSaddle());

                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
    }

    private void enderman(EntityDeathEvent e)
    {
        if (e.getEntity().getCustomName().equals(ChatColor.RED + "Tubby Enderman"))
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
                items.add(5, new me.totalfreedom.smpitems.item.Bee());
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
                items.add(10, new Respirator());
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
                items.add(10, new PowerEye());
                items.add(5, new Spoon());
                items.add(5, new SuperFood());
                items.add(5, new Drill());
                items.add(2, new LuckyPick());
                items.add(0.1, new End());
                items.add(0.01, new Landscaper());
                items.add(20, new MagicalSaddle());

                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
    }

    private void creeper(EntityDeathEvent e)
    {
        if (e.getEntity().getCustomName().equals(ChatColor.RED + "Tubby Creeper"))
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
                items.add(5, new me.totalfreedom.smpitems.item.Bee());
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
                items.add(10, new Respirator());
                items.add(10, new POWbow());
                items.add(5, new TreeBow());
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
                items.add(5, new SuperFood());
                items.add(5, new Drill());
                items.add(2, new LuckyPick());
                items.add(0.01, new Landscaper());
                items.add(20, new MagicalSaddle());

                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
    }

    private void spider(EntityDeathEvent e)
    {
        if (e.getEntity().getCustomName().equals(ChatColor.GOLD + "Tubby Spider"))
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
                items.add(10, new Respirator());
                items.add(20, new FreedomBow());
                items.add(20, new FreedomSword());
                items.add(20, new FreedomPick());
                items.add(20, new PickL());
                items.add(20, new ShovelL());
                items.add(10, new SpeedStick());
                items.add(10, new SharpStick());
                items.add(5, new Spoon());
                items.add(5, new SuperFood());
                items.add(5, new Drill());
                items.add(0.2, new POWbow());
                items.add(2, new LuckyPick());
                items.add(0.01, new Landscaper());
                items.add(20, new MagicalSaddle());

                CustomItem item = items.next();
                e.getDrops().add(item.getStack());
            }
        }
    }

    public void wither(EntityDeathEvent e)
    {
        if (e.getEntity().getCustomName().equals(ChatColor.DARK_RED + "Tubby Wither"))
        {
            RandomCollection<CustomItem> items = new RandomCollection<>();
            items.add(25, new WitherAxe());
            items.add(25, new UltimatiumBoots());
            items.add(25, new UltimatiumHelmet());
            items.add(20, new UltimatiumLeggings());
            items.add(15, new UltimatiumChest());
            items.add(5, new Flux());
            items.add(0.1, new Landscaper());

            CustomItem item = items.next();
            e.getDrops().add(item.getStack());
        }
    }

    public void enderDragon(EntityDeathEvent e)
    {
        if (e.getEntity() == MobSpawn.activeDragon.getEntity())
        {
            List<CustomItem> dropped = new ArrayList<>();
            for (int i = 0; i < 2; i++)
            {
                RandomCollection<CustomItem> items = new RandomCollection<>();
                items.add(25, new UltimatiumBoots());
                items.add(25, new UltimatiumHelmet());
                items.add(20, new UltimatiumChest());
                items.add(20, new UltimatiumLeggings());
                items.add(10, new End());
                items.add(2, new Flare());
                items.add(25, new LuckyPick());
                items.add(20, new PowerEye());
                items.add(0.1, new Landscaper());

                dropped.add(items.next());
            }
            new BukkitRunnable()
            {
                public void run()
                {
                    e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), dropped.get(0).getStack());
                    e.getEntity().getWorld().dropItem(e.getEntity().getLocation(), dropped.get(1).getStack());
                }
            }.runTaskLater(plugin, 40);
        }
    }
}
