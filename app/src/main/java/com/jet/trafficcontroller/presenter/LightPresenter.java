package com.jet.trafficcontroller.presenter;

import android.os.Handler;

import com.jet.trafficcontroller.model.LightState;
import com.jet.trafficcontroller.provider.LightStateProvider;
import com.jet.trafficcontroller.view.LightView;

/**
 * Created by bill on 4/19/17.
 */

public class LightPresenter {

    private LightView mView;
    private Handler mHandler;
    private int mCurrentState;
    private LightStateProvider mLightStateProvider;
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            next();
        }
    };

    public LightPresenter(LightView lightView){
        mView = lightView;
        mHandler = new Handler();
        mLightStateProvider = new LightStateProvider();
    }

    public void start() {
        mCurrentState = -1;
        next();
    }

    public void next() {
        if(mCurrentState == 5)
            mCurrentState = 0;
        else
            mCurrentState++;

        LightState lightState = mLightStateProvider.getLightState(mCurrentState);
        mView.setLightState(lightState);
        mHandler.postDelayed(runnable, lightState.getDuration() * 1000);
    }
}
