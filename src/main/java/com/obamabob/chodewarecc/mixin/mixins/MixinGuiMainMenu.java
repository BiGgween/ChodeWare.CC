package com.obamabob.chodewarecc.mixin.mixins;

import com.obamabob.chodewarecc.Bruh;
import net.minecraft.client.gui.GuiMainMenu;
import net.minecraft.client.gui.GuiScreen;
import net.minecraft.client.gui.ScaledResolution;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(GuiMainMenu.class)
public class MixinGuiMainMenu extends GuiScreen {
    @Inject(method = "drawScreen", at = @At("TAIL"), cancellable = true)
    public void drawText(int mouseX, int mouseY, float partialTicks, CallbackInfo ci){
        if (!Bruh.getInstance().versionChecker.isUpToDate()) this.drawString(this.fontRenderer, "ChodeWare.CC is not up to date!", (this.width/2) - (this.fontRenderer.getStringWidth("ChodeWare.CC is not up to date!")/2), 2, 0xFF0000);
    }
}
