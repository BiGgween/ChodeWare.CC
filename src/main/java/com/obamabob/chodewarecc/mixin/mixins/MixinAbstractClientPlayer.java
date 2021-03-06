package com.obamabob.chodewarecc.mixin.mixins;

import com.obamabob.chodewarecc.Bruh;
import com.obamabob.chodewarecc.util.ModConfig;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.client.network.NetworkPlayerInfo;
import net.minecraft.util.ResourceLocation;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import javax.annotation.Nullable;
import java.util.UUID;

@Mixin(AbstractClientPlayer.class)
public abstract class MixinAbstractClientPlayer {
    @Shadow @Nullable protected abstract NetworkPlayerInfo getPlayerInfo();

    @Inject(method = "getLocationCape", at = @At("HEAD"), cancellable = true)
    public void getLocationCape(CallbackInfoReturnable<ResourceLocation> cir){
        String uuid = getPlayerInfo().getGameProfile().getId().toString();

        if(Bruh.getInstance().chodiaChecker.isChodia(uuid) && ModConfig.capes) {
            cir.setReturnValue(new ResourceLocation("chodewarecc:textures/cape.png"));
        }
    }
}
