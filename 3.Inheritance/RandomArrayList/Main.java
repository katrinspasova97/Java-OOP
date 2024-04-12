package L_03_P_03_RandomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList <Integer> numbers = new RandomArrayList<>();
        numbers.add(13);
        numbers.add(49);
        numbers.add(69);
        numbers.add(73);
        numbers.add(11);

        System.out.println(numbers.getRandomElement());
    }
}
