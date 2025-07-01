package com.leondrolio.mc.minever.client;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.hud.HudElementRegistry;
import net.minecraft.SharedConstants;
import net.minecraft.client.MinecraftClient;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;


@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class MineVerClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    System.out.println("Installed MineVer Mod Successfully!");
    HudElementRegistry.addLast(Identifier.of("minever", "version"), (context, tickCounter) -> {
      String version = SharedConstants.getGameVersion().id();
      Text text = Text.literal(String.format("Minecraft %s", version));
      context.drawTextWithShadow(MinecraftClient.getInstance().textRenderer, text, 2, 2, -1);
    });
  }
}
