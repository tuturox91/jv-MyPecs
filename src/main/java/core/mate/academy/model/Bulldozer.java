package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {

    double bladeSize;

    public Bulldozer() {
    }

    public Bulldozer(double bladeSizeInches) {
        bladeSize = bladeSizeInches;
    }

    public double getBlade() {
        return  bladeSize;
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
