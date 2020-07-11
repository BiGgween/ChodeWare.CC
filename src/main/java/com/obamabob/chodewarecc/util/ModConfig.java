package com.obamabob.chodewarecc.util;

import com.obamabob.chodewarecc.Bruh;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = Bruh.MODID)
@Config.LangKey("chodewarecc.config.title")
public class ModConfig {
    public static boolean capes = true;
    public static boolean tabNames = true;

    @Mod.EventBusSubscriber(modid = Bruh.MODID)
    private static class EventHandler {
        @SubscribeEvent
        public static void onConfigChanged(final ConfigChangedEvent.OnConfigChangedEvent event) {
            if (event.getModID().equals(Bruh.MODID)) {
                ConfigManager.sync(Bruh.MODID, Config.Type.INSTANCE);
            }
        }
    }
}