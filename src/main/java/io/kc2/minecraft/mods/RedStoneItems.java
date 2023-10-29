package io.kc2.minecraft.mods;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class RedStoneItems implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
    public static final Logger LOGGER = LoggerFactory.getLogger("redstone-items-kc2-io");
	public static ToolItem REDSTONE_PICKAXE = new PickaxeItem(RedStoneItemsToolMaterial.INSTANCE, 3, -2.8F, new FabricItemSettings());
	public static ToolItem REDSTONE_AXE = new AxeItem(RedStoneItemsToolMaterial.INSTANCE, 9, -3.8F, new FabricItemSettings());
	public static ToolItem REDSTONE_HOE = new HoeItem(RedStoneItemsToolMaterial.INSTANCE, 1, -3.8F, new FabricItemSettings());
	public static ToolItem REDSTONE_SWORD = new SwordItem(RedStoneItemsToolMaterial.INSTANCE, 8, -3.8F, new FabricItemSettings());

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Loading redstone-items-kc-io");
		// Register custom items:
		Registry.register(Registries.ITEM, new Identifier("kc2.io:redstone_items", "redstone_pickaxe"), REDSTONE_PICKAXE);
		Registry.register(Registries.ITEM, new Identifier("kc2.io:redstone_items", "redstone_axe"), REDSTONE_AXE);
		Registry.register(Registries.ITEM, new Identifier("kc2.io:redstone_items", "redstone_hoe"), REDSTONE_HOE);
		Registry.register(Registries.ITEM, new Identifier("kc2.io:redstone_items", "redstone_sword"), REDSTONE_SWORD);
		// Add custom items to inventory:
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.add(REDSTONE_PICKAXE); });
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.add(REDSTONE_AXE); });
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.add(REDSTONE_HOE); });
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.add(REDSTONE_SWORD); });

	}
}

/*
	public static ToolItem REDSTONE_PICKAXE = new PickaxeItem(RedStoneToolMaterial.INSTANCE, 7, -5.8F, new FabricItemSettings());

	public static final Logger LOGGER = LoggerFactory.getLogger("DadsMod");
	@Override
	public void onInitialize() {
		LOGGER.info("Loading DadsMod!!");
		Registry.register(Registries.ITEM, new Identifier("tutorial", "custom_item"), CUSTOM_ITEM);
		Registry.register(Registries.ITEM, new Identifier("tutorial", "redstone_pickaxe"), REDSTONE_PICKAXE);
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(content -> {content.add(REDSTONE_PICKAXE); });
		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {content.add(CUSTOM_ITEM);
		});
	}


 */