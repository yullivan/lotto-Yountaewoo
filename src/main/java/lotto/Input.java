package lotto;

import java.util.Scanner;

public class Input {
    public static int purchasePrice() {
        Scanner scanner = new Scanner(System.in);
        int price;
        while (true) {
            price = scanner.nextInt();
            try {
                Price purchasePrice = new Price(price);
                break;
            } catch (IllegalArgumentException e) {
                System.out.println("다시 입력하십시오.");
            }
        }
        return price;
    }
}
