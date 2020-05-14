package tfsmp.smpitems.item;

import lombok.Getter;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import tfsmp.smpitems.item.variant.CompactAttribute;
import tfsmp.smpitems.item.variant.CompactEnchantment;
import tfsmp.smpitems.item.variant.Variant;
import tfsmp.smpitems.util.Groups;
import tfsmp.smpitems.util.SUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

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

    // item type
    private ItemType itemType;

    // variant
    private Variant variant;

    // color of the name
    @Getter
    private ChatColor color;

    public CustomItem(String name, Material type, Rarity rarity, ItemType itemType)
    {
        this.stack = new ItemStack(type);
        this.meta = stack.getItemMeta();
        this.lore = new ArrayList<>();
        this.rarity = rarity;
        this.itemType = itemType;
        switch (itemType)
        {
            case MELEE: variant = getRandomVariant(Groups.MELEE_VARIANTS); break;
        }
        this.setName(name);
        if (variant != null)
        {
            this.setName(variant.getName() + " " + name);
            for (CompactEnchantment enchantment : variant.getEnchantments())
                this.addEnchant(enchantment.getEnchantment(), enchantment.getLevel());
            for (CompactAttribute attribute : variant.getAttributes())
                this.addAttribute(attribute.getAttribute(), attribute.getAmount());
            if (variant.isUnbreakable())
                meta.setUnbreakable(true);
        }
        this.addLoreLine(rarity.getDisplay());
        this.applyMetaToStack();
    }

    public CustomItem(String name, List<Material> types, Rarity rarity, ItemType itemType)
    {
        this(name, types.get(new Random().nextInt(types.size())), rarity, itemType);
    }

    public void setName(String name)
    {
        meta.setDisplayName(name);
    }

    public String getName()
    {
        return meta.getDisplayName();
    }

    public void setColor(ChatColor color)
    {
        this.color = color;
        this.setName(color + getName());
    }

    public void applyMetaToStack()
    {
        lore.remove(rarity.getDisplay());
        lore.add(rarity.getDisplay());
        meta.setLore(lore);
        stack.setItemMeta(meta);
    }

    public void addAttribute(Attribute attr, double amount, AttributeModifier.Operation operation)
    {
        meta.addAttributeModifier(attr, new AttributeModifier(SUtil.getStringAttribute(attr), amount, operation));
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

    public Variant getRandomVariant(List<Variant> variants)
    {
        return variants.get(new Random().nextInt(variants.size()));
    }
}