package L_02_P_04_firstAndReserveTeam;

public class Person {
    private static final int MIN_NAME_LENGTH = 3;
    private static final int MIN_AGE = 1;
    private static final double MIN_SALARY = 460;
    private static final double BONUS_THRESHOLD = 30;
    private String firstName;
    private String lastName;
    private int age;
    private double salary;

    public Person(String firstName, String lastName, int age, double salary) {
        setFirstName(firstName);
        setLastName(lastName);
        setAge(age);
        setSalary(salary);
    }
    public void setFirstName(String firstName) {
        if(firstName.length() < MIN_NAME_LENGTH){
            throw new IllegalArgumentException("First name cannot be less than 3 symbols");
        }
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        if(lastName.length() < MIN_NAME_LENGTH){
            throw new IllegalArgumentException("Last name cannot be less than 3 symbols");
        }
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if(age < MIN_AGE ){
            throw new IllegalArgumentException("Age cannot be zero or negative integer");
        }
        this.age = age;
    }
    public void setSalary(double salary) {
        if(salary < MIN_SALARY){
            throw new IllegalArgumentException("Salary cannot be less than 460 leva");
        }
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }
    //Read percent bonus to every person salary. People younger than 30 get a half bonus.
    //•	increaseSalary(double bonus)
    public void increaseSalary(double bonus) {
        if (this.age < BONUS_THRESHOLD) {
            bonus = bonus / 2;
        }
        salary = this.salary * (1 + (bonus/100));

    }
    public String toString() {
        //Angel Ivanov gets 2640.0 leva
        return String.format("%s %s gets %f leva",this.firstName, this.lastName, this.salary);
    }
}
