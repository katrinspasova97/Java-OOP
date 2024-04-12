package L_01_WorkingWithAbstracts.trafficLight;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //масив от тези изброими цветове
        Color [] colors = Arrays.stream(scanner.nextLine().split("\\s+")) // масив от текстове ["GREEN", "RED", "YELLOW"]
                        .map(Color::valueOf) // вземам всеки един от елементите и търся неговата стойност като запис в enum Color
                        .toArray(Color[]::new); // масив в който искам да се създва масив от цветове

        int n = Integer.parseInt(scanner.nextLine()); //колко на брой пъти ще сменя цвета на светофарите
        //списък със светофари
        List <TrafficLight> trafficLightsList = new ArrayList<>();
        //за всеки един цвят, който ми е въведен първоначално в масива colors
        for (Color color : colors) {
            //създаваме нов светофар
            TrafficLight trafficLight = new TrafficLight(color);
            //добавяме го към списъка със светофарите
            trafficLightsList.add(trafficLight);

        }
        //списък със светофарите
        for (int i = 1; i <= n ; i++) {
            //свеняме цвета на всеки светофар от списъка
            for (TrafficLight trafficLight:trafficLightsList) {
                //променяме цвета
                trafficLight.changeColor();
                //след промяната на цвета отпечатваме новия цвят
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();
        }
    }
}
