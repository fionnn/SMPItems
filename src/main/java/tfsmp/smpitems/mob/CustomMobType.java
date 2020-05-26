package tfsmp.smpitems.mob;

public enum CustomMobType
{
    TUBBY_CREEPER(TubbyCreeper.class),
    TUBBY_ENDER_DRAGON(TubbyEnderDragon.class),
    TUBBY_ENDERMAN(TubbyEnderman.class),
    TUBBY_LOOT_MIDGET(TubbyLootMidget.class),
    TUBBY_PILLAGER(TubbyPillager.class),
    TUBBY_SKELETON(TubbySkeleton.class),
    TUBBY_SPIDER(TubbySpider.class),
    TUBBY_STRAY(TubbyStray.class),
    TUBBY_WITHER(TubbyWither.class),
    TUBBY_WITHER_SKELETON(TubbyWitherSkeleton.class),
    TUBBY_ZOMBIE(TubbyZombie.class);

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