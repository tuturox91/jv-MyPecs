package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;

import java.util.ArrayList;
import java.util.List;

public class BulldozerProducer implements MachineProducer<Bulldozer> {

    @Override
    public List<Bulldozer> get() {
        List<Bulldozer> bulldozers = new ArrayList<>();
        bulldozers.add(new Bulldozer(100));
        bulldozers.add(new Bulldozer(300));
        bulldozers.add(new Bulldozer(250));
        bulldozers.add(new Bulldozer(180));

        return bulldozers;
    }
}
