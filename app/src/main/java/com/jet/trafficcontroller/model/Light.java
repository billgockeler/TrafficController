package com.jet.trafficcontroller.model;

import android.support.annotation.IntDef;

/**
 * Created by bill on 4/19/17.
 */

public class Light {

    public static final int RED = 0;
    public static final int YELLOW = 1;
    public static final int GREEN = 2;

    @IntDef ({RED, YELLOW, GREEN})
    public @interface Color{}

    @Color private int color;

    public Light(@Color int color) {
        this.color = color;
    }

    public int getColor() {
        return color;
    }

    public void setColor(int color) {
        this.color = color;
    }
}
