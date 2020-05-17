package tfsmp.smpitems.listener;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.BookMeta;
import tfsmp.smpitems.SMPItems;
import tfsmp.smpitems.util.SUtil;

import java.util.ArrayList;

public class PlayerJoinListener implements Listener
{

    private SMPItems plugin;

    public PlayerJoinListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    ArrayList<String> pages = new ArrayList<String>();

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e)
    {
        Player player = e.getPlayer();

        if (!player.hasPlayedBefore())
        {
            ItemStack book = new ItemStack(Material.WRITTEN_BOOK);
            BookMeta bookMeta = (BookMeta) book.getItemMeta();

            bookMeta.setTitle(SUtil.color("&2SMPItems Wiki"));
            bookMeta.setAuthor(SUtil.color("&aspeednt & squarent"));
            pages.add(SUtil.color("&2Welcome to the\n&lSMPItems Wiki!\n\n" +
                    "&2&lContents&2\n" +
                    "[Items; 2-10]\n" +
                    "[Tubby Wither; 11-12]\n" +
                    "[Tubby Dragon; 13]"));
            pages.add(SUtil.color("&2&lItems\n&8&lCommon Items&8\n" +
                    "Bone Sword - +300% Damage;\n" +
                    "Bow - Punch 3;\n" +
                    "Hoe - Efficiency 2;\n" +
                    "Long Bow - Power 5;\n" +
                    "Pickaxe - Unbreaking 2;\n" +
                    "Shield - +3 Health;\n" +
                    "Shovel - Unbreaking 2;\n" +
                    "Sword - Unbreaking 2."));
            pages.add(SUtil.color("&2&lItems\n&2&lUncommon Items&2\n" +
                    "Bootns - +5 Health;\n" +
                    "Leggingns - +5 Health;\n" +
                    "Chesntplate - +5 Health;\n" +
                    "Helmnet - +5 Health;\n" +
                    "da hoe - Unbreaking 5;\n" +
                    "Ol' Sturdy - Unbreaking 5;\n" +
                    "Pick? - Efficiency 3;\n" +
                    "Protector - +5 Health."));
            pages.add(SUtil.color("&2&lItems\n&9&lRare Items&9\n" +
                    "Boots - +20% Speed, +3 Health;\n" +
                    "Flesh Sword - Knockback 5;\n" +
                    "Freedom Axe - +100% Speed;\n" +
                    "Freedom Bow - +100% Speed;\n" +
                    "Freedom Pick - +100% Speed;\n" +
                    "Freedom Sword - +100% Speed;"));
            pages.add(SUtil.color("&2&lItems\n&9&lRare Items&9\n" +
                    "Jeans - +20% Speed, +3 Health;\n" +
                    "Pick! - Efficiency 4;\n" +
                    "Hat - +20% Speed, +3 Health;\n" +
                    "Shirt - +20% Speed, +3 Health;"));
            pages.add(SUtil.color("&2&lItems\n&5&lEpic Items&5\n" +
                    "Obsidian Pick - Unbreaking 10, Efficiency 6;\n" +
                    "Power Eye - Summons a tubby dragon when put in 4 set end frames. &l(see: Tubby Dragon);&5\n" +
                    "Respirator - Infinite water breathing;\n" +
                    "sharp stick!!! - Sharpness 10;\n"));
            pages.add(SUtil.color("&2&lItems\n&5&lEpic Items&5\n" +
                    "speed stick!!! - +300% Speed;\n" +
                    "Tubby Wither Skeleton Skull - Summons a tubby wither when put on a body. &l(see: Tubby Wither)&5."));
            pages.add(SUtil.color("&2&lItems\n&6&lLegendary Items&6\n" +
                    "Bee - +500% Damage, +5 Health;\n" +
                    "Drill - Efficiency 10, breaks a 2x2 hole;\n" +
                    "End? - Sharpness 10, +500% Damage;\n" +
                    "Landscaper - Knockback 20, +200% Damage;\n" +
                    "Lucky Pick - Fortune 10;\n"));
            pages.add(SUtil.color("&2&lItems\n&6&lLegendary Items&6\n" +
                    "POW! Bow - Power 10, Punch 20;\n" +
                    "Super Food - Fills food bar with cooldown;\n" +
                    "Turtle Shield - +75% Knockback Resistance, +20 Health;\n" +
                    "Ultimatium Armor Set - +5 Health, Protection 10;\n" +
                    "Wither Axe - Efficiency 10."));
            pages.add(SUtil.color("&2&lItems\n&1&lPearlescent Items&1\n" +
                    "Flux - Heals when used, with cooldown;\n" +
                    "Flare - When placed, mobs cannot spawn in the set radius."));
            pages.add(SUtil.color("&2&lTubby Wither&2\n" +
                    "Here is a guide on how to spawn the Tubby Wither:\n\n" +
                    "- You will need to collect 3 obsidian, 1 gold block and 2 tubby wither skulls.\n" +
                    "- First, create the regular shape for a wither using obsidian. For arrangement, see smp-items.fandom.com"));
            pages.add(SUtil.color("&2&lTubby Wither&8\n" +
                    "- It has to face south, otherwise it will not work.\n" +
                    "- Place the two skulls on the obsidian and place the gold block last, this will spawn the Tubby Wither."));
            pages.add(SUtil.color("&2&lTubby Dragon&2\n" +
                    "Here is a guide on how to spawn the Tubby Dragon:\n\n" +
                    "- 4 portal frames would have been customised by an operator for use of the Tubby Dragon.\n" +
                    "- Place 4 power eyes inside these and the Tubby Dragon will spawn."));
            bookMeta.setPages(pages);
            book.setItemMeta(bookMeta);

            player.getInventory().addItem(book);
        }
    }
}