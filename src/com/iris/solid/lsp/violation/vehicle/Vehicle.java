package com.iris.solid.lsp.violation.vehicle;

/**
 * Created by vivek.panday on 10-01-2020.
 */
public class Vehicle {

    private Gear gear;

    public Gear getGear() {
        return gear;
    }

    public void changeGear(final Gear gear) {
        this.gear = gear;
    }

}