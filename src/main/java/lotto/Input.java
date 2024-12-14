package lotto;

import java.util.ArrayList;
import java.util.List;
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

    public static List<Integer> winningNumbers() {
        Scanner scanner = new Scanner(System.in);
        String numbers = scanner.nextLine();
        if ((numbers.length() - numbers.replace(String.valueOf(','), "").length()) != 5) {
            throw new IllegalArgumentException("[ERROR] 당첨번호는 총 6개 입니다.");
        }
        ArrayList<Integer> winningNumber = new ArrayList<>();
        for (String number : numbers.split(",")) {
            winningNumber.add(Integer.valueOf(number));
        }
        List<Integer> filters = winningNumber.stream()
                .filter(number -> number > 0 && number < 46)
                .toList();
        if (filters.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 잘못된 번호들입니다.");
        }
        return filters;
    }
}
