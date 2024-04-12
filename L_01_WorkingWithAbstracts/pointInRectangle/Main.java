package L_01_WorkingWithAbstracts.pointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // 0 0 3 3
        int [] coordinates = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int bottomLeftX = coordinates[0]; //0
        int bottomLeftY = coordinates[1]; //0
        int topRightX = coordinates[2]; //3
        int topRightY = coordinates[3]; //3

        Point bottomLeft = new Point(bottomLeftX, bottomLeftY); //долу ляво
        Point topRight = new Point(topRightX, topRightY); //горе дясно

        Rectangle rectangle = new Rectangle(bottomLeft, topRight); //правоъгълник

        int countPoints = Integer.parseInt(scanner.nextLine()); //броя на точките, които ще проверяваме
        for (int pointCount = 1; pointCount <= countPoints ; pointCount++) {
            // 0 1
            int[] checkPointCoordinates = Arrays.stream(scanner.nextLine().split(" "))
                    .mapToInt(Integer::parseInt).toArray();

            int x = checkPointCoordinates[0]; //0
            int y = checkPointCoordinates[1]; //1

            Point searchedPoint = new Point(x, y);
            System.out.println(rectangle.contains(searchedPoint));
        }
    }
}
