package L_01_WorkingWithAbstracts.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] dimensions = readPositions(scanner.nextLine());
        int rows = dimensions[0]; //редове
        int cols = dimensions[1]; //колони

        int [][] matrix = new int[rows][cols]; //матрица

        fillField(rows, cols, matrix);

        String command = scanner.nextLine();
        long sum = 0; //общо събраните звезди
        while (!command.equals("Let the Force be with you")) {
            //ЛОШИЯ
            int[] evilPosition = readPositions(scanner.nextLine()); //ред и колона на лошия
            int rowEvil = evilPosition[0]; //реда на лошия
            int colEvil = evilPosition[1]; //колоната на лошия
            //движение на лошия
            moveEvil(rowEvil, colEvil, matrix);
            //ДЖЕДАЯ
            int[] jediPosition = readPositions(command); // ред и колона на джедая
            int rowJedi = jediPosition[0];
            int colJedi = jediPosition[1];
            int collectStars = getCollectedStars(rowJedi, colJedi, matrix);
            sum += collectStars;
            command = scanner.nextLine();
        }

        System.out.println(sum);


    }

    private static int getCollectedStars(int rowJedi, int colJedi, int[][] matrix) {
        int countStars = 0;
        while (rowJedi >= 0 && colJedi < matrix[1].length) {
            if (rowJedi < matrix.length && colJedi >= 0 && colJedi < matrix[0].length) {
                countStars += matrix[rowJedi][colJedi];
            }
            colJedi++;
            rowJedi--;
        }
        return countStars;
    }

    private static void moveEvil(int rowEvil, int colEvil, int[][] matrix) {
        while (rowEvil >= 0 && colEvil >= 0) {
            if (rowEvil < matrix.length && colEvil < matrix[0].length) {
                matrix[rowEvil][colEvil] = 0;
            }
            rowEvil--;
            colEvil--;
        }
    }

    private static int[] readPositions(String command) {
        return Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
    }

    private static void fillField(int rows, int cols, int[][] matrix) {
        int value = 0;
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                matrix[row][col] = value++; //пълним матрицата
            }
        }
    }
}
