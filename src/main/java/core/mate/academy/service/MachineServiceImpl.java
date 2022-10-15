package core.mate.academy.service;

import core.mate.academy.model.Bulldozer;
import core.mate.academy.model.Excavator;
import core.mate.academy.model.Machine;
import core.mate.academy.model.Truck;

import java.util.ArrayList;
import java.util.List;

/**
 * Your implementation of MachineService.
 */
public class MachineServiceImpl<E extends Machine> implements  MachineService<E> {


    @Override
    public List<Machine> getAll(Class<? extends E> type) {
        if(Bulldozer.class.equals(type)) {
            BulldozerProducer bulldozerProducer = new BulldozerProducer();
            return  new ArrayList<>(bulldozerProducer.get());
        } else if (Excavator.class.equals(type)) {
            ExcavatorProducer excavatorProducer = new ExcavatorProducer();
            return  new ArrayList<>(excavatorProducer.get());
        } else if(Machine.class.equals(type)) {
            TruckProducer truckProducer = new TruckProducer();
            return  new ArrayList<>(truckProducer.get());
        }
        return  null;
    }

    @Override
    public void fill(List<? super Machine> machines, Machine value) {

    }

    @Override
    public void startWorking(List<? extends Machine> machines) {

    }


}
