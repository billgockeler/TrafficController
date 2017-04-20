package com.jet.trafficcontroller.model;

import android.support.annotation.NonNull;

/**
 * Created by bill on 4/19/17.
 */

public class Street {
    private String name;
    private Light light;

    public Street(@NonNull String name, @NonNull Light light) {
        this.light = light;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Light getLight() {
        return light;
    }

    public void setLight(Light light) {
        this.light = light;
    }

}
