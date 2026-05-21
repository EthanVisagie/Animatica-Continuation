package io.github.foundationgames.animatica.mixin;

import io.github.foundationgames.animatica.Animatica;
import net.minecraft.client.gui.screen.option.GameOptionsScreen;
import net.minecraft.client.gui.screen.option.VideoOptionsScreen;
import net.minecraft.text.Text;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(VideoOptionsScreen.class)
public abstract class VideoOptionsScreenMixin extends GameOptionsScreen {
    protected VideoOptionsScreenMixin(Text title) {
        super(null, null, title);
    }

    @Inject(method = "addOptions", at = @At("TAIL"))
    private void animatica$addTextureAnimationOptionButton(CallbackInfo ci) {
        this.body.addSingleOptionEntry(Animatica.CONFIG.getAnimatedTexturesOption());
    }
}
