package L_01_WorkingWithAbstracts;

import java.util.Scanner;

public class P_01_RhombusOfStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        printTopPart(n);
        printRow(n, n);
        // printMiddlePart(n); // може да се замести с printRow(n, row)
        printBottomPart(n);

    }

    private static void printTopPart(int n) {
        // горна част = n
        //  *
        // * *
        for (int row = 1; row <= n - 1; row++) {
            //имаме 2 интервала и * на първия ред => " ", " ", "*"
            //имаме интервал * интервал * на втория ред => " ", "*", " ", "*"
            printRow(n, row);
            //System.out.println();

        }
    }

    private static void printMiddlePart(int n) {
        //средна част
        //* * *
        //имаме * интервал * интервал * на третия ред => "*", " ", "*", " ", "*"
        //колкото ми е n, толкова * имаме, които вървят с интервал
        for (int i = 1; i <= n; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    private static void printBottomPart(int n) {
        // долна част = n - 1
        // * *
        //  *
        for (int row = n - 1; row >= 1; row--) {
            printRow(n, row);
            //System.out.println();
        }
    }

    private static void printRow(int n, int row) {
        //всики ред => {брой интервали = n - row}{брой звезди = row}
        //n = 3
        //1 ред -> 2 интервала, 1 звезда
        //2 ред -> 1 интервал, 2 звезди
        //броя на интервалите = n - номера на реда
        //броя на звездите отговаря на намера на реда
        for (int space = 1; space <= n - row; space++) {
            System.out.print(" ");
        }
        for (int stars = 1; stars <= row ; stars++) {
            System.out.print("* ");
        }
        System.out.println();
    }
}
