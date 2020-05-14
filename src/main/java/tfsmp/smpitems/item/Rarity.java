package tfsmp.smpitems.item;

import lombok.Getter;
import org.bukkit.ChatColor;

public enum Rarity
{
    COMMON(ChatColor.WHITE),
    UNCOMMON(ChatColor.GREEN),
    RARE(ChatColor.BLUE),
    EPIC(ChatColor.DARK_PURPLE),
    LEGENDARY(ChatColor.GOLD),
    PEARLESCENT(ChatColor.AQUA),
    SPECIAL(ChatColor.YELLOW);

    @Getter
    private final ChatColor color;

    Rarity(ChatColor color)
    {
        this.color = color;
    }

    public String getDisplay()
    {
        return color + "" + ChatColor.BOLD + name();
    }
}