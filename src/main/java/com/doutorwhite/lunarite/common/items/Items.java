package com.doutorwhite.lunarite.common.Items;

import com.doutorwhite.lunarite.common.RegistryHandler;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;

public class Items {
    public static final RegistryObject<Item> TEST_ITEM = RegistryHandler.ITEMS.register("test_item", () ->
            new Item(new Item.Properties().group(ItemGroup.MISC)));
}
