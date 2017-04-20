package com.jet.trafficcontroller.view;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.jet.trafficcontroller.presenter.LightPresenter;
import com.jet.trafficcontroller.R;
import com.jet.trafficcontroller.model.Light;
import com.jet.trafficcontroller.model.LightState;

import butterknife.ButterKnife;
import butterknife.InjectView;

public class LightActivity extends AppCompatActivity implements LightView {

    @InjectView(R.id.left_light) View mLeftLight;
    @InjectView(R.id.right_light) View mRightLight;
    @InjectView(R.id.top_light) View mTopLight;
    @InjectView(R.id.bottom_light) View mBottomLight;
    @InjectView(R.id.vertical_street_name) TextView mVerticalStreetName;
    @InjectView(R.id.horizontal_street_name) TextView mHorizontalStreetName;

    LightPresenter controller;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.inject(this);

        controller = new LightPresenter(this);
        controller.start();
    }

    @Override
    public void setLightState(LightState lightState) {
        mVerticalStreetName.setText(lightState.getVerticalStreet().getName());
        mHorizontalStreetName.setText(lightState.getHorizontalStreet().getName());

        Light horizontalStreetLight = lightState.getHorizontalStreet().getLight();
        Light verticalStreetLight = lightState.getVerticalStreet().getLight();

        switch(horizontalStreetLight.getColor()){
            case(Light.RED):
                mLeftLight.setBackgroundColor(getResources().getColor(R.color.colorRed));
                mRightLight.setBackgroundColor(getResources().getColor(R.color.colorRed));
                break;
            case(Light.YELLOW):
                mLeftLight.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                mRightLight.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                break;
            case(Light.GREEN):
                mLeftLight.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                mRightLight.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                break;
        }

        switch(verticalStreetLight.getColor()){
            case(Light.RED):
                mTopLight.setBackgroundColor(getResources().getColor(R.color.colorRed));
                mBottomLight.setBackgroundColor(getResources().getColor(R.color.colorRed));
                break;
            case(Light.YELLOW):
                mTopLight.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                mBottomLight.setBackgroundColor(getResources().getColor(R.color.colorYellow));
                break;
            case(Light.GREEN):
                mTopLight.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                mBottomLight.setBackgroundColor(getResources().getColor(R.color.colorGreen));
                break;
        }

    }
}
