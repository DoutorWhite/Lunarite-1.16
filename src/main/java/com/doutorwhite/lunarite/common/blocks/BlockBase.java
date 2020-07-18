package com.doutorwhite.lunarite.common.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.loot.LootContext;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IWorld;
import net.minecraft.world.World;
import net.minecraftforge.common.ToolType;

import java.util.List;

public class BlockBase extends Block {
    public BlockBase(Material MATERIAL, Float HARDNESS, int HARVEST_LEVEL, SoundType SOUND, ToolType TOOL) {
        super(Properties.create(MATERIAL)
                    .hardnessAndResistance(HARDNESS)
                    .harvestLevel(HARVEST_LEVEL)
                    .harvestTool(TOOL)
                    .sound(SOUND));
    }
    public BlockBase(Material MATERIAL, Float HARDNESS, int HARVEST_LEVEL, SoundType SOUND, ToolType TOOL, Float SLIP, Float FACTOR){
        super(Properties.create(MATERIAL)
                .hardnessAndResistance(HARDNESS)
                .harvestLevel(HARVEST_LEVEL)
                .harvestTool(TOOL)
                .sound(SOUND)
                .slipperiness(SLIP)
                .speedFactor(FACTOR));
    }
}
