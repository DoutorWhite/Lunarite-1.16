package com.doutorwhite.lunarite;

import com.doutorwhite.lunarite.common.RegistryHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("lunaritemod")
public class Lunarite {
    public static final String MOD_ID = "lunaritemod";

    public Lunarite(){
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);

        new RegistryHandler().register();
        MinecraftForge.EVENT_BUS.register(this);
    }
    private void setup(final FMLCommonSetupEvent event){

    }
    private void client(final FMLClientSetupEvent event){

    }
}
