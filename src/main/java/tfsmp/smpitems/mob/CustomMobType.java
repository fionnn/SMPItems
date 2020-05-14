package tfsmp.smpitems.mob;


public enum CustomMobType
{
    TUBBY_ZOMBIE(ZombieMob.class),
    TUBBY_SKELETON(SkeletonMob.class),
    TUBBY_WITHER_SKELETON(WitherSkeletonMob.class),
    TUBBY_LOOT_MIDGET(MidgetMob.class),
    TUBBY_ENDERMAN(EndermanMob.class);

    private final Class<? extends CustomMob> clazz;

    CustomMobType(Class<? extends CustomMob> clazz)
    {
        this.clazz = clazz;
    }

    public Class<? extends CustomMob> getCustomMobClass()
    {
        return clazz;
    }

    public static CustomMobType findMobType(String s)
    {
        return valueOf(s.toUpperCase());
    }
}