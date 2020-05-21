package dev.rootnet.freeedition;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.Mod;

@Mod(
        modid = FreeEdition.MOD_ID,
        name = FreeEdition.MOD_NAME,
        version = FreeEdition.VERSION
)
public class FreeEdition {

    public static final String MOD_ID = "rootnet-free";
    public static final String MOD_NAME = "rootNET Free Edition";
    public static final String VERSION = "1.0";

    @Mod.Instance
    public static FreeEdition INSTANCE;

    @Mod.EventHandler
    public void postinit(FMLPostInitializationEvent event) {
        MinecraftForge.EVENT_BUS.register(FreeEditionEvent.class);
    }

}
