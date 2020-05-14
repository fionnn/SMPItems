package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;

public class Ron extends CustomItem
{
    public Ron()
    {
        super("pencil", Material.STICK, Rarity.SPECIAL, ItemType.OTHER);
        super.addLoreLine("&cron honey");
        super.addLoreLine("&e&o+0% Damage");
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 0.0);
        super.applyMetaToStack();
    }
}