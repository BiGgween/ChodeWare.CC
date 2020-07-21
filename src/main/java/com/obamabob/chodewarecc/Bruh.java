package com.obamabob.chodewarecc;

import com.obamabob.chodewarecc.util.ChodiaChecker;
import com.obamabob.chodewarecc.util.VersionChecker;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Bruh.MODID, name = "ChodeWare.CC", version = "b1")
public class Bruh {
    public static final String MODID = "chodewarecc";

    public final int VERSION = 4;

    public ChodiaChecker chodiaChecker;
    public VersionChecker versionChecker;

    @Mod.Instance
    private static Bruh INSTANCE;

    public Bruh(){
        INSTANCE = this;
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        chodiaChecker = new ChodiaChecker();
        versionChecker = new VersionChecker();
    }

    public static Bruh getInstance(){
        return INSTANCE;
    }

}
