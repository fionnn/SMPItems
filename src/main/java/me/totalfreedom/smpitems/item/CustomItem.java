package me.totalfreedom.smpitems.item;

import lombok.Getter;
import me.totalfreedom.smpitems.item.variant.Variant;
import me.totalfreedom.smpitems.util.CompactAttribute;
import me.totalfreedom.smpitems.util.CompactEnchantment;
import me.totalfreedom.smpitems.util.Groups;
import me.totalfreedom.smpitems.util.SUtil;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

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

    // raw name
    @Getter
    private String rawName;

    // rarity
    private Rarity rarity;

    // item type
    private ItemType itemType;

    // variant
    private Variant variant;

    // color
    @Getter
    private ChatColor color;

    public CustomItem(String name, Material type, Rarity rarity, ItemType itemType)
    {
        this.stack = new ItemStack(type);
        this.meta = stack.getItemMeta();
        this.lore = new ArrayList<>();
        this.rawName = name;
        this.rarity = rarity;
        this.itemType = itemType;
        switch (itemType)
        {
            case MELEE: variant = getRandomVariant(Groups.MELEE_VARIANTS); break;
            case RANGED: variant = getRandomVariant(Groups.RANGED_VARIANTS); break;
            case ARMOR: variant = getRandomVariant(Groups.ARMOR_VARIANTS); break;
            case SHIELD: variant = getRandomVariant(Groups.SHIELD_VARIANTS); break;
            case TOOLS: variant = getRandomVariant(Groups.TOOLS_VARIANTS); break;
        }
        this.setName(rarity.getColor() + name);
        if (variant != null)
        {
            this.setName(rarity.getColor() + variant.getName() + " " + name);
            for (CompactEnchantment enchantment : variant.getEnchantments())
                this.addEnchant(enchantment.getEnchantment(), enchantment.getLevel());
            for (CompactAttribute attribute : variant.getAttributes())
                this.addAttribute(attribute.getAttribute(), attribute.getAmount(), attribute.getOperation());
            if (variant.isUnbreakable())
                meta.setUnbreakable(true);
        }
        this.color = rarity.getColor();
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
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
    }

    public void addAttribute(Attribute attr, double amount)
    {
        addAttribute(attr, amount, AttributeModifier.Operation.ADD_NUMBER);
    }

    public void addEnchant(Enchantment enchantment, int level)
    {
        meta.addEnchant(enchantment, level, true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
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