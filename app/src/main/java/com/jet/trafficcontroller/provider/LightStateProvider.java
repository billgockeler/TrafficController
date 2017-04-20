package com.jet.trafficcontroller.provider;

import com.jet.trafficcontroller.model.Light;
import com.jet.trafficcontroller.model.LightState;
import com.jet.trafficcontroller.model.Street;

/**
 * Created by bill on 4/19/17.
 */

public class LightStateProvider {

    LightState[] mLightStates;

    public LightStateProvider() {
        mLightStates = new LightState[6];
        mLightStates[0] = new LightState(new Street("Elm Street", new Light(Light.RED)), new Street("Main Street", new Light(Light.RED)), 1);
        mLightStates[1] = new LightState(new Street("Elm Street", new Light(Light.RED)), new Street("Main Street", new Light(Light.GREEN)), 5);
        mLightStates[2] = new LightState(new Street("Elm Street", new Light(Light.RED)), new Street("Main Street", new Light(Light.YELLOW)), 2);
        mLightStates[3] = new LightState(new Street("Elm Street", new Light(Light.RED)), new Street("Main Street", new Light(Light.RED)), 1);
        mLightStates[4] = new LightState(new Street("Elm Street", new Light(Light.GREEN)), new Street("Main Street", new Light(Light.RED)), 5);
        mLightStates[5] = new LightState(new Street("Elm Street", new Light(Light.YELLOW)), new Street("Main Street", new Light(Light.RED)), 2);

    }

    public LightState getLightState(int index){
        return mLightStates[index];
    }
}
