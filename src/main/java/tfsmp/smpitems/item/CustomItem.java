package tfsmp.smpitems.item;

import lombok.Getter;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import tfsmp.smpitems.util.SUtil;

import java.util.ArrayList;
import java.util.List;

public class CustomItem
{
    // the actual stack that is used in the game
    @Getter
    private ItemStack stack;

    // the stack's meta
    private ItemMeta meta;

    // the stack's lore
    private List<String> lore;

    // rarity
    private Rarity rarity;

    public CustomItem(String name, Material type, Rarity rarity)
    {
        this.stack = new ItemStack(type);
        this.meta = stack.getItemMeta();
        this.lore = new ArrayList<>();
        this.rarity = rarity;
        this.setName(name);
        this.addLoreLine(rarity.getDisplay());
        this.applyMetaToStack();
    }

    public void setName(String name)
    {
        meta.setDisplayName(name);
    }

    public void applyMetaToStack()
    {
        meta.setLore(lore);
        stack.setItemMeta(meta);
    }

    public void addAttribute(Attribute attr, double amount, AttributeModifier.Operation operation)
    {
        meta.addAttributeModifier(attr, new AttributeModifier(getStringAttribute(attr), amount, operation));
        meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
    }

    public void addAttribute(Attribute attr, double amount)
    {
        addAttribute(attr, amount, AttributeModifier.Operation.MULTIPLY_SCALAR_1);
    }

    public void addEnchant(Enchantment enchantment, int level)
    {
        meta.addEnchant(enchantment, level, true);
    }

    public void addLoreLine(String s)
    {
        lore.add(SUtil.color(s));
    }

    private static String getStringAttribute(Attribute attr)
    {
        switch (attr)
        {
            case GENERIC_MAX_HEALTH: return "generic.maxHealth";
            case GENERIC_MOVEMENT_SPEED: return "generic.movementSpeed";
            case GENERIC_ATTACK_DAMAGE: return "generic.attackDamage";
            case GENERIC_LUCK: return "generic.luck";
            case GENERIC_FOLLOW_RANGE: return "generic.followRange";
            case GENERIC_ARMOR: return "generic.armor";
            case HORSE_JUMP_STRENGTH: return "horse.jumpStrength";
            case GENERIC_ATTACK_SPEED: return "generic.attackSpeed";
            case GENERIC_FLYING_SPEED: return "generic.flyingSpeed";
            case GENERIC_ARMOR_TOUGHNESS: return "generic.armorToughness";
            case ZOMBIE_SPAWN_REINFORCEMENTS: return "zombie.spawnReinforcements";
            case GENERIC_KNOCKBACK_RESISTANCE: return "generic.knockbackResistance";
            default: return "";
        }
    }
}