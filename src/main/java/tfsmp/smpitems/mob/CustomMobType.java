package tfsmp.smpitems.mob;

public enum CustomMobType
{
    TUBBY_ZOMBIE(TubbyZombie.class),
    TUBBY_SKELETON(TubbySkeleton.class),
    TUBBY_WITHER_SKELETON(TubbyWitherSkeleton.class),
    TUBBY_LOOT_MIDGET(TubbyLootMidget.class),
    TUBBY_ENDERMAN(TubbyEnderman.class),
    TUBBY_STRAY(TubbyStray.class),
    TUBBY_CREEPER(TubbyCreeper.class);

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