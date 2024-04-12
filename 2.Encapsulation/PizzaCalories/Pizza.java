package EX_02_PizzaCalories_04;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    //-	name: String
    private String name;
    //-	dought:  Dough
    private Dough dough;
    //-	toppings: List<Topping>
    private List<Topping> toppings;
    //+ 	Piza (String, int numberOfToppings)

    public Pizza(String name, int count) {
        setToppings(count);
        setName(name);
    }

    //-	setToppings(int) : void
    //•	If a number of toppings are outside of the range [0..10]
    // throw an exception with the message "Number of toppings should be in range [0..10].".
    private void setToppings(int count) {
        if(count >= 0 && count <= 10) {
            //ако броя им е валиден, правим лист с този брой топинги
            this.toppings = new ArrayList<>(count);
        }else{
            throw new IllegalArgumentException("Number of toppings should be in range [0..10].");
        }
    }

    //-	setName(String) : void
    //•	If the name of the pizza is empty, only whitespace or longer than 15 symbols
    // throw an exception with the message "Pizza name should be between 1 and 15 symbols.".
    private void setName(String name) {
        if(!name.trim().isEmpty() && name.trim().length() <= 15){
            this.name = name;
        }else{
            throw new IllegalArgumentException("Pizza name should be between 1 and 15 symbols.");
        }
    }

    //+	setDough(Dough) : void
    public void setDough(Dough dough) {
        this.dough = dough;
    }

    //+	getName(): String
    public String getName() {
        return name;
    }

    //+	addTopping (Topping) : void
    public void addTopping (Topping topping){
        this.toppings.add(topping);
    }

    //+	getOverallCalories () : double
    public double getOverallCalories (){
        //калории от тестото + калории от топингите
        return this.dough.calculateCalories() + this.toppings.stream().mapToDouble(Topping::calculateCalories).sum();
    }
}
