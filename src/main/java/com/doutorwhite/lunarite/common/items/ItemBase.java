package com.doutorwhite.lunarite.common.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.ToolType;

public class ItemBase extends Item {
    public ItemBase(ItemGroup GROUP) {
        super(new Item.Properties().group(GROUP));
    }
    public ItemBase(ItemGroup GROUP, ToolType TOOL, int LEVEL, int DAMAGE){
        super(new Item.Properties().group(GROUP).addToolType(TOOL, LEVEL).maxDamage(DAMAGE));
    }
}
