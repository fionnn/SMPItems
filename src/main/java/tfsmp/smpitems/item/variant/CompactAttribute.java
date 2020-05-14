package tfsmp.smpitems.item.variant;

import lombok.Getter;
import org.bukkit.attribute.Attribute;

public class CompactAttribute
{
    @Getter
    private final Attribute attribute;

    @Getter
    private final double amount;

    public CompactAttribute(Attribute attribute, double amount)
    {
        this.attribute = attribute;
        this.amount = amount;
    }
}