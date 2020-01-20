package com.iris.solid.isp.violation;

/**
 * Created by vivek.panday on 10-01-2020.
 */
public abstract class Vehicle implements Action {

    private boolean engineRunning;

    public boolean isEngineRunning() {
        return engineRunning;
    }

    @Override
    public void startEngine() {
        engineRunning = true;
    }

    @Override
    public void shutDownEngine() {
        engineRunning = false;
    }

}