package me.blackfur.aethersteelconfig.mixin;

import net.mcreator.aethersteel.init.AethersteelModBiomes;
import net.minecraftforge.event.server.ServerAboutToStartEvent;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(AethersteelModBiomes.class)
public class AetherSteelBiomeMixin {
    @Inject(
            method = "onServerAboutToStart",
            at = @At("HEAD"),
            remap = false,
            cancellable = true
    )
    private static void returnBeforeBiomes(ServerAboutToStartEvent event, CallbackInfo ci) {
        ci.cancel();
    }
}
