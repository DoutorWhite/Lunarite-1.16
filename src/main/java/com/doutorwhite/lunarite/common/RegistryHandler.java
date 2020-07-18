package com.doutorwhite.lunarite.common;

import com.doutorwhite.lunarite.common.items.ModItems;
import com.doutorwhite.lunarite.Lunarite;
import com.doutorwhite.lunarite.common.blocks.ModBlocks;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.RegistryObject;
import net.minecraft.item.Item;
import net.minecraft.block.Block;
import net.minecraftforge.registries.DeferredRegister;

public class RegistryHandler
{
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, "lunaritemod");
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "lunaritemod");

    public static void start() {
        final IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        RegistryHandler.BLOCKS.register(bus);
        RegistryHandler.ITEMS.register(bus);
    }

    public static RegistryObject<Block> register(String REGISTRY_NAME, Block BLOCK) {
        return (RegistryObject<Block>)RegistryHandler.BLOCKS.register(REGISTRY_NAME, () -> BLOCK);
    }

    public static RegistryObject<Item> register(String REGISTRY_NAME, Item ITEM) {
        return (RegistryObject<Item>)RegistryHandler.ITEMS.register(REGISTRY_NAME, () -> ITEM);
    }

    public static BlockItem toBlockItem(Block BLOCK, ItemGroup GROUP) {
        return new BlockItem(BLOCK, new Item.Properties().group(GROUP));
    }

    //Blocks
    public static final RegistryObject<Block> PETRIFIED_LUNARITE = register("petrified_lunarite", ModBlocks.PETRIFIED_LUNARITE);
    public static final RegistryObject<Item> PETRIFIED_LUNARITE_ITEM = register("petrified_lunarite", (Item)toBlockItem(ModBlocks.PETRIFIED_LUNARITE, Lunarite.LUNARITE_TAB));

    //Items
    public static final RegistryObject<Item> LUNARITE_SHARD = register("lunarite_shard", ModItems.LUNARITE_SHARD);
}