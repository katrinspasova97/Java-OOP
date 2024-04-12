package hierarchy;

public class Vehicle {
    private static final double DEFAULT_FUEL_CONSUMPTION = 1.25; // разход на гориво - по подразбиране
    private double fuelConsumption; // литри разход за 1 километър - реален разход на гориво
    private double fuel; // налични литри гориво
    private int horsePower; // конски сили
    //•	A public constructor which accepts (fuel, horsePower) and set the default fuel consumption on the field fuelConsumption

    public Vehicle(double fuel, int horsePower) {
        this.fuel = fuel;
        this.horsePower = horsePower;
        this.fuelConsumption = DEFAULT_FUEL_CONSUMPTION;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getHorsePower() {
        return horsePower;
    }

    public void setHorsePower(int horsePower) {
        this.horsePower = horsePower;
    }

    //•	void drive(double kilometers)
    //o	The drive method should have the functionality to reduce the fuel based on the traveled kilometers and fuel consumption.
    // Keep in mind that you can drive the vehicle only if you have enough fuel to finish the driving.
    public void drive(double kilometers){
        //1. колко гориво ще изгорим ако минем тези километри (double kilometers)
        double consumedFuel = kilometers * this.getFuelConsumption();
        //2. дали горивото което имаме ще стигне да минем тези километри (double kilometers)
        if(this.getFuel() >= consumedFuel){
            //пътувам толкова километри (double kilometers)
            //изчислявам след пътуването колко гориво ми остава
            double leftFuel = this.getFuel() - consumedFuel;
            //оставащото гориво го задавам
            this.setFuel(leftFuel);
        }
    }

}
