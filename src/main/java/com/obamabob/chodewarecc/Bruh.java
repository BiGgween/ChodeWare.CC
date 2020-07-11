package com.obamabob.chodewarecc;

import com.obamabob.chodewarecc.util.CapeUtils;
import com.obamabob.chodewarecc.util.NameUtils;
import me.zero.alpine.EventBus;
import me.zero.alpine.EventManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;

@Mod(modid = Bruh.MODID, name = "ChodeWare.CC", version = "b1")
public class Bruh {
    public static final String MODID = "chodewarecc";

    public CapeUtils capeUtils;
    public NameUtils nameUtils;

    public static final EventBus EVENT_BUS = new EventManager();

    @Mod.Instance
    private static Bruh INSTANCE;

    public Bruh(){
        INSTANCE = this;
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event){
        capeUtils = new CapeUtils();
        nameUtils = new NameUtils();
    }

    public static Bruh getInstance(){
        return INSTANCE;
    }

}
