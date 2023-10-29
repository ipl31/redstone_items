package io.kc2.minecraft.mods;

import net.minecraft.item.Items;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;


public class RedStoneItemsToolMaterial implements ToolMaterial {


    public static final RedStoneItemsToolMaterial INSTANCE = new RedStoneItemsToolMaterial();
    @Override
    public int getDurability() {
        return 3000;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 10.0F;
    }

    @Override
    public float getAttackDamage() {
        return 2.0F;
    }

    @Override
    public int getMiningLevel() {
        return 4;
    }

    @Override
    public int getEnchantability() {
        return 30;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Items.REDSTONE_BLOCK);
    }


}
