package EX_02_PizzaCalories_04;

public class Topping {
    //-	toppingType: String
    private String toppingType;
    //-	weight: double
    private double weight;
    //+ 	Topping (String, double)

    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }

    //-	setToppingType (String): void
    //•	Meat – 1.2;
    //•	Veggies – 0.8;
    //•	Cheese – 1.1;
    //•	Sauce – 0.9;

    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese") || toppingType.equals("Sause")) {
            this.toppingType = toppingType;
        } else {
            String message = "Cannot place " + toppingType +" on top of your pizza.";
        throw new IllegalArgumentException(message);
        }
    }

    //-	setWeight (double): void

    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else {
            String message = this.toppingType + " weight should be in the range [1..50].";
            throw new IllegalArgumentException(message);
        }
    }

    //+	calculateCalories (): double
    public double calculateCalories (){

        double toppingTypeCoefficient = 0;

        if(this.toppingType.equals("Meat")){
            toppingTypeCoefficient = 1.2;
        }else if(this.toppingType.equals("Veggies")){
            toppingTypeCoefficient = 0.8;
        } else if (this.toppingType.equals("Cheese")) {
            toppingTypeCoefficient = 1.1;
        } else if (this.toppingType.equals("Sause")) {
            toppingTypeCoefficient= 0.9;
        }
        return (this.weight * 2) * toppingTypeCoefficient;
    }
}
