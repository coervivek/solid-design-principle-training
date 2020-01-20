package com.iris.solid.lsp.solution.vehicle;

/**
 * Created by vivek.panday on 10-01-2020.
 */
public class Vehicle {

    private boolean isMoving;
    private Gear gear;

    public void move(){
        isMoving = true;
    }

    public void stop(){
        isMoving = false;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        this.gear = gear;
    }

}