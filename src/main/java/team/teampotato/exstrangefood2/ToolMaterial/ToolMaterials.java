package team.teampotato.exstrangefood2.ToolMaterial;

import java.util.function.Supplier;

import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.util.Lazy;

//工具
public enum ToolMaterials implements net.minecraft.item.ToolMaterial {
    EXSFSYNCRETIC(8, 10000, 25.0F, 5.0F, 40, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.NETHER_STAR});
    }),
    COPPER(4, 500, 3.0F, 3.0F, 12, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.COPPER_INGOT});
    }),
    GENG(1, 5, 5.0F, 5.0F, 1, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.COPPER_INGOT});
    }),
    DIAMONDKNIFE(3, 1561, 8.0F, 3.0F, 20, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.COPPER_INGOT});
    }),
    AweiSWORD(3, 1561, 8.0F, 3.0F, 20, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.DIAMOND});
    }),
    amethystshard(4, 800, 4.0F, 5.0F, 20, () -> {
        return Ingredient.ofItems(new ItemConvertible[]{Items.COPPER_INGOT});
    });


//材料类型注册
    private final int miningLevel;
    private final int itemDurability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Lazy<Ingredient> repairIngredient;

    private ToolMaterials(int miningLevel, int itemDurability, float miningSpeed, float attackDamage, int enchantability, Supplier<Ingredient> repairIngredient) {
        this.miningLevel = miningLevel;
        this.itemDurability = itemDurability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantability;
        this.repairIngredient = new Lazy(repairIngredient);
    }

    public int getDurability() {
        return this.itemDurability;
    }

    public float getMiningSpeedMultiplier() {
        return this.miningSpeed;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getMiningLevel() {
        return this.miningLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairIngredient() {
        return (Ingredient)this.repairIngredient.get();
    }
}
