package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;

public class Flux extends CustomItem
{
    public Flux()
    {
        super("Flux", Material.BEACON, Rarity.PEARLESCENT, ItemType.OTHER);
        super.addLoreLine(ChatColor.LIGHT_PURPLE + "Ability: Heal Pool");
        super.addLoreLine(ChatColor.GRAY + "60s Cooldown");
        super.applyMetaToStack();
    }
}