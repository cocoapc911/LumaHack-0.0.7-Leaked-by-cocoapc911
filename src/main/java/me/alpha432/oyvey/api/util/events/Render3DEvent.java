// 
// Decompiled by Procyon v0.5.36
// 

package me.alpha432.oyvey.api.util.events;

import me.alpha432.oyvey.api.util.EventStage;

public class Render3DEvent extends EventStage
{
    private final float partialTicks;
    
    public Render3DEvent(final float partialTicks) {
        this.partialTicks = partialTicks;
    }
    
    public float getPartialTicks() {
        return this.partialTicks;
    }
}
