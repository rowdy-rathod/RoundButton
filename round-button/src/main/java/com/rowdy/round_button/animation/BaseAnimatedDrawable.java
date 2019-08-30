package com.rowdy.round_button.animation;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;

public abstract class BaseAnimatedDrawable extends Drawable implements Animatable {

    /**
     * Clear all resource
     */
    public abstract void dispose();

    /**
     * Set up the animations.
     */
    public abstract void setupAnimations();
}