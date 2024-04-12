package EX_02_PizzaCalories_04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Topping Veggies 50
        //Topping Cheese 50
        //END

        //Pizza Meatless 2
        String pizzaData = scanner.nextLine();
        String pizzaName = pizzaData.split("\\s+")[1];
        int numberOfToppings = Integer.parseInt(pizzaData.split("\\s+")[2]);

        Pizza pizza = new Pizza(pizzaName, numberOfToppings);

        //Dough Wholegrain Crispy 100
        String doughData = scanner.nextLine();
        String doughFlourType = doughData.split("\\s+")[1];
        String doughBakingTechnique = doughData.split("\\s+")[2];
        double doughWeight = Double.parseDouble(doughData.split("\\s+")[3]);

        Dough dough = new Dough(doughFlourType, doughBakingTechnique, doughWeight);
        pizza.setDough(dough);

        String toppingData = scanner.nextLine();
        while (!toppingData.equals("END")){
            //Topping Veggies 50
            String toppingType = toppingData.split("\\s+")[1];
            double toppingWeight = Double.parseDouble((toppingData.split("\\s+")[2]));

            Topping topping = new Topping(toppingType, toppingWeight);
            pizza.addTopping(topping);

            toppingData = scanner.nextLine();
        }

        //getOverallCalories ()
        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());

    }
}