package com.iris.solid.isp.violation;

/**
 * Created by vivek.panday on 16-04-2016.
 */
public interface Action {

    void startEngine();

    void shutDownEngine();

    void turnRadioOn();

    void turnRadioOff();

    void turnCameraOn();

    void turnCameraOff();
}


