package com.leondrolio.mc.minever.client;

import net.fabricmc.api.ClientModInitializer;

@net.fabricmc.api.Environment(net.fabricmc.api.EnvType.CLIENT)
public class MineVerClient implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    System.out.println("MineVer Client initialised!");
  }
}
