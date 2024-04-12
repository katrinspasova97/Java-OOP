package EX_02_Box_01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        Box box = new Box(length, width, height);

        double surface = box.calculateSurfaceArea();
        double literalSurface = box.calculateLateralSurfaceArea();
        double volume = box.calculateVolume();

        System.out.printf("Surface Area - %.2f%n", surface);
        System.out.printf("Lateral Surface Area - %.2f%n", literalSurface);
        System.out.printf("Volume – %.2f%n", volume);

    }

}
