package com.jet.trafficcontroller.model;

import android.support.annotation.NonNull;

/**
 * Created by bill on 4/19/17.
 */

public class LightState {
    private Street horizontalStreet;
    private Street verticalStreet;
    private int duration;

    public LightState(@NonNull Street horizontalStreet, @NonNull Street verticalStreet, int duration){
        this.horizontalStreet = horizontalStreet;
        this.verticalStreet = verticalStreet;
        this.duration = duration;
    }

    public Street getVerticalStreet() {
        return verticalStreet;
    }

    public void setVerticalStreet(@NonNull Street verticalStreet) {
        this.verticalStreet = verticalStreet;
    }

    public Street getHorizontalStreet() {
        return horizontalStreet;
    }

    public void setHorizontalStreet(@NonNull Street horizontalStreet) {
        this.horizontalStreet = horizontalStreet;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
