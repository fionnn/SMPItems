package tfsmp.smpitems.listener;

import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.item.VampireFang;
import tfsmp.smpitems.item.WitherAxe;
import tfsmp.smpitems.util.SUtil;

public class DamageListener implements Listener
{
    private SMPItems plugin;
    public DamageListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent e)
    {
        if (!(e.getDamager() instanceof LivingEntity) || !(e.getEntity() instanceof LivingEntity))
        {
            return;
        }

        LivingEntity damager = (LivingEntity) e.getDamager();
        LivingEntity damaged = (LivingEntity) e.getEntity();

        if (damager.getEquipment() == null)
        {
            return;
        }

        if (SUtil.isItemValid(damager.getEquipment().getItemInMainHand(), new WitherAxe()) && !damaged.hasPotionEffect(PotionEffectType.WITHER))
        {
            damaged.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 2));
        }

        if (SUtil.isItemValid(damager.getEquipment().getItemInMainHand(), new VampireFang()))
        {
            damager.setHealth(damager.getHealth() + 1);
        }
    }
}