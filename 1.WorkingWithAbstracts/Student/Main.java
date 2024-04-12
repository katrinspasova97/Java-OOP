package L_01_WorkingWithAbstracts.student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentSystem studentSystem = new StudentSystem();
        String[] input = readLine(scanner);
        while (!"Exit".equals(input[0])) {
            studentSystem.parseCommand(input);
            input = readLine(scanner);
        }
    }

    private static String[] readLine(Scanner scanner) {
        return scanner.nextLine().split(" ");
    }
}
