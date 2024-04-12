package hierarchy;

public class Car extends Vehicle {
//наследяваме -> fuelConsumption, fuel, horsePower
// наследяваме-> getters and setters, drive(double kilometers)

    private static final double DEFAULT_FUEL_CONSUMPTION = 3;

    public Car(double fuel, int horsePower) {
        super(fuel, horsePower);
        this.setFuelConsumption(DEFAULT_FUEL_CONSUMPTION);
    }
}
