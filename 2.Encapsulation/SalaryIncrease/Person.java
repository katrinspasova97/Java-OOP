package L_02_P_02_salaryIncrease;


public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Read percent bonus to every person salary. People younger than 30 get a half bonus.
    //•	increaseSalary(double bonus)
    public void increaseSalary(double bonus) {
        if (this.age < 30) {
            bonus = bonus / 2;
        }
            salary = this.salary * (1 + (bonus/100));

    }
    public String toString() {
        //Angel Ivanov gets 2640.0 leva
        return String.format("%s %s gets %f leva",this.firstName, this.lastName, this.salary);
    }
}
