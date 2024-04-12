package EX_02_ShoppingSpree_03;

import java.util.ArrayList;
import java.util.List;

public class Person {
     private String name;
    private double money;
    private List<Product> products;

    public Person(String name, double money) {
        setName(name);
        setMoney(money);
        this.products = new ArrayList<>();
    }

    private void setName(String name) {
        if (!name.trim().isEmpty()) {
            this.name = name;
        } else {
            throw new IllegalArgumentException("Name cannot be empty");
        }
     }

    private void setMoney(double money) {
        if (money > 0) {
            this.money = money;
        } else {
            throw new IllegalArgumentException("Money cannot be negative");
        }
    }

    public String getName() {
        return name;
    }

    public void buyProduct(Product product){
        //проверка дали имам пари
        //1. Имам пари -> добавяме продукта в спикъка с продукти
        //ако наличните пари са повече или равни на цената на продукта
        if(this.money >= product.getCost()){
            products.add(product);
            //купувам го и намалявам парите с цената на продукта
            this.money -= product.getCost();
        }
        //2.Нямам пари -> не го купуваме и отпечатваме => throw new Exeption -> "{Person name} can't afford {Product name}"
        else {
                             //"{Person name} can't afford {Product name}"
            String message = this.getName() + " can't afford " + product.getName();
            throw new IllegalArgumentException(message);
        }
    }
}
