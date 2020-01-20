package com.iris.solid.lsp.violation;

/**
 * Created by vivek.panday on 16-04-2016.
 */
public class Car extends Vehicle {

    @Override
    public void changeGear(Gear gear) {
        if(Gear.REVERSE.equals(gear) && getGear().equals(Gear.DRIVING)){
            throw new RuntimeException("Can't change to REVERSE gear when " + getGear().toString() + " gear is engaged!");
        }
    }
}
