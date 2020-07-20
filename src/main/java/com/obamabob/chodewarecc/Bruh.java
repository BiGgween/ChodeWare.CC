package com.obamabob.chodewarecc;

import com.obamabob.chodewarecc.util.ChodiaChecker;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Bruh.MODID, name = "ChodeWare.CC", version = "b1")
public class Bruh {
    public static final String MODID = "chodewarecc";

    public ChodiaChecker chodiaChecker;

    @Mod.Instance
    private static Bruh INSTANCE;

    public Bruh(){
        INSTANCE = this;
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        chodiaChecker = new ChodiaChecker();
    }

    public static Bruh getInstance(){
        return INSTANCE;
    }

}
