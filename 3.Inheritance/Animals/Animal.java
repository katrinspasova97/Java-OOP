package animals;

public class Animal {
    private String name;
    private int age;
    private String gender;

    public Animal(String name, int age, String gender) {
        setAge(age);
        setGender(gender);
        setName(name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if(!name.trim().isEmpty()) {
            this.name = name;
        }else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age >= 0) {
            this.age = age;
        }else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        if(!gender.trim().isEmpty()) {
            this.gender = gender;
        }else {
            throw new IllegalArgumentException("Invalid input!");
        }
    }

    public String produceSound(){
        return "";
    }

    @Override
    public String toString() {
        //Frog
        //Kermit 12 Male
        //Ribbit
        return String.format("%s%n" +
                        "%s %d %s%n" +
                        "%s", this.getClass().getSimpleName() ,
                this.getName(), this.getAge(), this.getGender(),
                this.produceSound());
    }
}
