package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import tfsmp.smpitems.util.Groups;

public class BoneSword extends CustomItem
{
    public BoneSword()
    {
        super("Bone Sword", Groups.VANILLA_SWORDS, Rarity.COMMON, ItemType.MELEE);
        super.setColor(ChatColor.WHITE);
        super.addLoreLine("&f+200% Damage");
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 2.0);
        super.applyMetaToStack();
    }
}