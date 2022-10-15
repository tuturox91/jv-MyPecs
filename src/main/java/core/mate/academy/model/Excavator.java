package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Excavator
 * Do not remove no-args constructor
 */
public class Excavator extends Machine {
    double scoopCapacity;

    public Excavator() {
    }

    public Excavator(double scoopCapacity) {
        this.scoopCapacity = scoopCapacity;
    }

    public double getScoopCapacity() {
        return  scoopCapacity;
    }

    @Override
    public void doWork() {
        System.out.println("Excavator started to work");
    }
}
