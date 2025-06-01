package com.leondrolio.mc.winver.mixin;

import net.minecraft.SharedConstants;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.hud.InGameHud;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(InGameHud.class)
public class WinverHud {
  @Inject(method = "render", at = @At("RETURn"))
  public void onRender(DrawContext context, float tickDelta, CallbackInfo info) {
    MinecraftClient client = MinecraftClient.getInstance();
    if (!client.getDebugHud().shouldShowDebugHud()) {
      String version = SharedConstants.getGameVersion().getName();
      Text text = Text.literal(String.format("Minecraft %s", version));
      context.drawTextWithShadow(client.textRenderer, text, 2, 2, 0xFFFFFF);
    }
  }
}
