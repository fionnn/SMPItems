package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class SharpStick extends CustomItem
{
    public SharpStick()
    {
        super("sharp stick!!!", Material.STICK, Rarity.EPIC, ItemType.MELEE);
        super.setColor(ChatColor.DARK_PURPLE);
        super.addLoreLine("&f10 Sharpness");
        super.addEnchant(Enchantment.DAMAGE_ALL, 10);
        super.applyMetaToStack();
    }
}