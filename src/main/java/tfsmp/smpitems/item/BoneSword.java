package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;

public class BoneSword extends CustomItem
{
    public BoneSword()
    {
        super("Bone Sword", Material.IRON_SWORD, Rarity.COMMON, ItemType.MELEE);
        super.setColor(ChatColor.GRAY);
        super.addLoreLine("&f+200% Damage");
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 2.0);
        super.applyMetaToStack();
    }
}