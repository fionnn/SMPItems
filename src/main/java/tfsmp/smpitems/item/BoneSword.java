package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;

public class BoneSword extends CustomItem
{
    public BoneSword()
    {
        super(ChatColor.GRAY + "Bone Sword", Material.IRON_SWORD);
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 5.0);
        super.applyMetaToStack();
    }
}