package com.iris.solid.ocp.solution.vehicle;

/**
 * Created by vivek.panday on 16-04-2016.
 */
public class Economy implements DrivingMode{

    private static final int POWER = 300;
    private static final int SUSPENSION_HEIGHT = 20;

    @Override
    public int getPower() {
        return POWER;
    }

    @Override
    public int getSuspensionHeight() {
        return SUSPENSION_HEIGHT;
    }
}
