package com.kaykserver.multitechmod;

import com.kaykserver.multitechmod.setup.ModSetup;
import com.kaykserver.multitechmod.setup.ClientSetup;
import com.kaykserver.multitechmod.setup.Registration;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(com.kaykserver.multitechmod.MultiTechMod.MODID)
public class MultiTechMod {

    private static final Logger LOGGER = LogManager.getLogger();
    public static final String MODID = "multitechmod";

    public MultiTechMod() {

        // Register the deferred registry
        Registration.init();

        // Register the setup method for modloading
        IEventBus modbus = FMLJavaModLoadingContext.get().getModEventBus();
        modbus.addListener(ModSetup::init);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> modbus.addListener(ClientSetup::init));
    }
}
