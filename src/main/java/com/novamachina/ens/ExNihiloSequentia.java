package com.novamachina.ens;

import com.novamachina.ens.client.setup.ClientSetup;
import com.novamachina.ens.common.item.tools.hammer.HammerBaseItem;
import com.novamachina.ens.common.loot.modifier.UseHammerModifier;
import com.novamachina.ens.common.setup.ModInitialization;
import com.novamachina.ens.common.utility.Config;
import com.novamachina.ens.common.utility.Constants;
import com.novamachina.ens.common.utility.Constants.ModInfo;
import com.novamachina.ens.common.utility.LogUtil;
import javax.annotation.Nonnull;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.loot.GlobalLootModifierSerializer;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Constants.ModInfo.MOD_ID)
public class ExNihiloSequentia {

    public static boolean itemRegistrationFinished = false;

    public ExNihiloSequentia() {
        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, Config.COMMON_CONFIG);

        ModInitialization.init(FMLJavaModLoadingContext.get().getModEventBus());

//        FMLJavaModLoadingContext.get().getModEventBus().addListener(ModInitialization::init);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(ClientSetup::init);
        MinecraftForge.EVENT_BUS.register(HammerBaseItem.class);
    }



//    public void onModLoading(FMLLoadCompleteEvent event) {
//        RegistryManager.ACTIVE.getRegistry(GameData.BLOCKS).getRaw(new ResourceLocation("minecraft","cobblestone"));
//        RegistryManager.ACTIVE.getRegistry(GameData.BLOCKS).getEntries();
//    }
}
