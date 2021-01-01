package com.kestalkayden.beef.jerky;

import net.fabricmc.api.ModInitializer;

import net.minecraft.item.FoodComponent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BeefJerky implements ModInitializer {

	//public static final Item BEEF_JERKY = new FabricItem(new Item.Settings().group(ItemGroup.MISC).food(new FoodComponent.Builder().hunger(1).saturationModifier(6f)));
    public static final Item BEEF_JERKY = new FabricItem(new Item.Settings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(1).saturationModifier(6f).build()));

    //new FabricItem(new Item.Settings().group(ItemGroup.MISC).food(new FoodComponent.Builder().hunger(1).saturationModifier(6f), 0.5f).build());

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier("beefjerky", "beef_jerky"), BEEF_JERKY);
    }    
}
