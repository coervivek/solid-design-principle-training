package com.iris.solid.srp.solution.vehicle;

/**
 * Created by vivek.panday on 10-01-2020.
 */
public class FuelPump {

    public void reFuel(final Vehicle vehicle){
        final var remainingFuel = vehicle.getRemainingFuel();
        final var additionalFuel = vehicle.getMaxFuel() - remainingFuel;
        vehicle.setRemainingFuel(remainingFuel + additionalFuel);
    }
}
