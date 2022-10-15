package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {

    double loadСapacity;

    public Truck() {
    }

    public Truck(double loadСapacity) {
        this.loadСapacity = loadСapacity;
    }

    public double getLoadCapacity() {
        return loadСapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
