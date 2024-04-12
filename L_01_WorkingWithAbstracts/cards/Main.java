package L_01_WorkingWithAbstracts.cards;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rank = scanner.nextLine();
        String suit = scanner.nextLine();
        Card card = new Card(CardSuit.valueOf(suit), CardRank.valueOf(rank));
        //Card name: TWO of CLUBS; Card power: 2
        System.out.print("Card name: ");
        System.out.print(rank + " of " + suit + "; Card power: " + card.cardPower());

    }
}
