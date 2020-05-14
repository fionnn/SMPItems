package tfsmp.smpitems.util;

import org.bukkit.Material;
import tfsmp.smpitems.item.variant.*;

import java.util.Arrays;
import java.util.List;

public class Groups
{
    public static List<Material> VANILLA_SWORDS = Arrays.asList(Material.WOODEN_SWORD, Material.STONE_SWORD, Material.IRON_SWORD, Material.GOLDEN_SWORD, Material.DIAMOND_SWORD);
    public static List<Material> VANILLA_AXES = Arrays.asList(Material.WOODEN_AXE, Material.STONE_AXE, Material.IRON_AXE, Material.GOLDEN_AXE, Material.DIAMOND_AXE);
    public static List<Material> VANILLA_PICKAXES = Arrays.asList(Material.WOODEN_PICKAXE, Material.STONE_PICKAXE, Material.IRON_PICKAXE, Material.GOLDEN_PICKAXE, Material.DIAMOND_PICKAXE);
    public static List<Material> VANILLA_SHOVELS = Arrays.asList(Material.WOODEN_SHOVEL, Material.STONE_SHOVEL, Material.IRON_SHOVEL, Material.GOLDEN_SHOVEL, Material.DIAMOND_SHOVEL);
    public static List<Material> VANILLA_HOES = Arrays.asList(Material.WOODEN_HOE, Material.STONE_HOE, Material.IRON_HOE, Material.GOLDEN_HOE, Material.DIAMOND_HOE);

    public static List<Variant> MELEE_VARIANTS = Arrays.asList(new Swift(), new MeleeHefty(), new Light(), new MeleeSharp(), new MeleeLucky(), new MeleeRefined(), new Unbreakable());
    public static List<Variant> RANGED_VARIANTS = Arrays.asList(new Forceful(), new RangedSharp(), new Unbreakable(), new Light(), new RangedHefty());
    public static List<Variant> ARMOR_VARIANTS = Arrays.asList(new Fast(), new Padded(), new Hard(), new ArmorHefty(), new ArmorShieldRefined(), new Smooth(), new ArmorShieldLucky());
    public static List<Variant> SHIELD_VARIANTS = Arrays.asList(new Fast(), new Hard(), new ShieldHefty(), new ArmorShieldRefined(), new ArmorShieldLucky());
    public static List<Variant> TOOLS_VARIANTS = Arrays.asList(new Quick(), new ToolsLucky(), new Unbreakable());
}