package tfsmp.smpitems.item.variant;

import lombok.Getter;
import lombok.Setter;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.CompactAttribute;
import tfsmp.smpitems.util.CompactEnchantment;

import java.util.ArrayList;
import java.util.List;

public class Variant
{
    @Getter
    private String name;

    @Getter
    private List<CompactAttribute> attributes;

    @Getter
    private List<CompactEnchantment> enchantments;

    @Getter
    @Setter
    private boolean unbreakable;

    public Variant(String name)
    {
        this.name = name;
        this.attributes = new ArrayList<>();
        this.enchantments = new ArrayList<>();
        this.unbreakable = false;
    }

    public void addAttribute(Attribute attr, double amount, AttributeModifier.Operation operation)
    {
        attributes.add(new CompactAttribute(attr, amount, operation));
    }

    public void addAttribute(Attribute attr, double amount)
    {
        attributes.add(new CompactAttribute(attr, amount));
    }

    public void addEnchant(Enchantment enchantment, int level)
    {
        enchantments.add(new CompactEnchantment(enchantment, level));
    }
}