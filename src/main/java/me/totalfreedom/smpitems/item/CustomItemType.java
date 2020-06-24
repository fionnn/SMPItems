package me.totalfreedom.smpitems.item;

import org.bukkit.entity.Bat;

public enum CustomItemType
{
    AXE(Axe.class),
    BATTERY(Battery.class),
    BEE(Bee.class),
    BONE_SWORD(BoneSword.class),
    BOOTNS(Bootns.class),
    BOOTS(Boots.class),
    BOW(Bow.class),
    CHESNTPLATE(Chesntplate.class),
    DAHOE(DaHoe.class),
    DRILL(Drill.class),
    END(End.class),
    FIONN(Fionn.class),
    FLARE(Flare.class),
    FLESH_SWORD(FleshSword.class),
    FLUX(Flux.class),
    FREEDOM_AXE(FreedomAxe.class),
    FREEDOM_BOW(FreedomBow.class),
    FREEDOM_PICK(FreedomPick.class),
    FREEDOM_SWORD(FreedomSword.class),
    HAT(Hat.class),
    HELMNET(Helmnet.class),
    HOE(Hoe.class),
    JEANS(Jeans.class),
    LANDSCAPER(Landscaper.class),
    LEGGINGNS(Leggingns.class),
    LONG_BOW(LongBow.class),
    LUCKY_PICK(LuckyPick.class),
    MAGICAL_SADDLE(MagicalSaddle.class),
    OBSIDIAN_PICK(ObsidianPick.class),
    OL_STURDY(OlSturdy.class),
    PHASER(Phaser.class),
    PICK(Pick.class),
    PICKAXE(Pickaxe.class),
    PICKL(PickL.class),
    POW_BOW(POWbow.class),
    POWER_EYE(PowerEye.class),
    PROTECTOR(Protector.class),
    RADAR(Radar.class),
    RESPIRATOR(Respirator.class),
    RON(Ron.class),
    SHAM(Sham.class),
    SHARP_STICK(SharpStick.class),
    SHIELD(Shield.class),
    SHIRT(Shirt.class),
    SHOVEL(Shovel.class),
    SHOVELL(ShovelL.class),
    SPEED(Speed.class),
    SPEED_STICK(SpeedStick.class),
    SPOON(Spoon.class),
    SQUARE(Square.class),
    SUMMONING_SCYTHE(SummoningScythe.class),
    SUPER(Super.class),
    SUPER_FOOD(SuperFood.class),
    SWORD(Sword.class),
    TREE_BOW(TreeBow.class),
    TUBBY_WITHER_SKELETON_SKULL(TubbyWitherSkeletonSkull.class),
    TURTLE_SHIELD(TurtleShield.class),
    ULTIMATIUM_BOOTS(UltimatiumBoots.class),
    ULTIMATIUM_CHESTPLATE(UltimatiumChest.class),
    ULTIMATIUM_HELMET(UltimatiumHelmet.class),
    ULTIMATIUM_LEGGINGS(UltimatiumLeggings.class),
    VAMPIRE_FANG(VampireFang.class),
    WITHER_AXE(WitherAxe.class);

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