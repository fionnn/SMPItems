package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class CustomItem
{
    // the actual stack that is used in the game
    private ItemStack stack;

    // the stack's meta
    private ItemMeta meta;

    public CustomItem(String name, Material type)
    {
        this.stack = new ItemStack(type);
        this.meta = stack.getItemMeta();
        this.setName(name);
        this.applyMetaToStack();
    }

    public void setName(String name)
    {
        meta.setDisplayName(name);
    }

    public void applyMetaToStack()
    {
        stack.setItemMeta(meta);
    }

    public void addAttribute(Attribute attr, double amount, AttributeModifier.Operation operation)
    {
        meta.addAttributeModifier(attr, new AttributeModifier(getStringAttribute(attr), amount, operation));
    }

    public void addAttribute(Attribute attr, double amount)
    {
        addAttribute(attr, amount, AttributeModifier.Operation.MULTIPLY_SCALAR_1);
    }

    public ItemStack getStack()
    {
        return stack;
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