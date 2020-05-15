package tfsmp.smpitems.item;

public enum CustomItemType
{
    AXE(Axe.class);

    private final Class<? extends CustomItem> clazz;

    CustomItemType(Class<? extends CustomItem> clazz)
    {
        this.clazz = clazz;
    }

    public Class<? extends CustomItem> getCustomItemClass()
    {
        return clazz;
    }

    public static CustomItemType findItemType(String s)
    {
        return valueOf(s.toUpperCase());
    }
}