package dev.luaq.partyban;

import net.minecraftforge.client.ClientCommandHandler;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Mod(modid = "partyban", version = "1.0")
public class PartyBan {
    private final List<String> commandsToRun = Arrays.asList("/pc Goodbye, %s", "/ignore add %s", "/p kick %s");

    @Mod.Instance
    public static PartyBan instance;

    @EventHandler
    public void init(FMLInitializationEvent event) {
        ClientCommandHandler.instance.registerCommand(new PBanCmd());
    }

    public List<String> getCommandsToRun() {
        return commandsToRun;
    }
}
