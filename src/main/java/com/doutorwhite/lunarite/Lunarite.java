package com.doutorwhite.lunarite;

import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.common.MinecraftForge;
import com.doutorwhite.lunarite.common.RegistryHandler;
import java.util.function.Consumer;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.common.Mod;

@Mod("lunaritemod")
public class Lunarite
{
    public static final String MOD_ID = "lunaritemod";


    public Lunarite() {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);

        new RegistryHandler().start();

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    }

    private void client(final FMLClientSetupEvent event) {
    }
    public static final ItemGroup LUNARITE_TAB = new ItemGroup("lunaritemod"){
        @Override
        public ItemStack createIcon(){
            return new ItemStack(RegistryHandler.LUNARITE_SHARD.get());
        }
    };

}