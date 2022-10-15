package core.mate.academy.service;

import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer<Truck> {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(200));
        trucks.add(new Truck(320.5));
        trucks.add(new Truck(120.5));

        return trucks;
    }
}
