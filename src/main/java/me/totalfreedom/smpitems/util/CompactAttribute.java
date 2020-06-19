package me.totalfreedom.smpitems.util;

import lombok.Getter;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;

public class CompactAttribute
{
    @Getter
    private final Attribute attribute;

    @Getter
    private final double amount;

    @Getter
    private final AttributeModifier.Operation operation;

    public CompactAttribute(Attribute attribute, double amount, AttributeModifier.Operation operation)
    {
        this.attribute = attribute;
        this.amount = amount;
        this.operation = operation;
    }

    public CompactAttribute(Attribute attribute, double amount)
    {
        this(attribute, amount, AttributeModifier.Operation.ADD_NUMBER);
    }
}