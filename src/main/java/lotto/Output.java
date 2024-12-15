package lotto;

import java.util.List;

public class Output {
    public static void purchasePrice() {
        System.out.println("구입금액을 입력해 주세요.");
    }

    public static void purchasedPrice(Price price)
    {
        System.out.println(price.getPrice());
    }

    public static void purchasedMount(Price price) {
        System.out.println(price.getPrice() / 1000 + "개를 구매했습니다.");
    }

    public static void purchasedLottoList (Price price) {
        for (LottoNumbers lottoNumbers : LottoNumbersList.purchasedLottonList(price)) {
            System.out.println(lottoNumbers.getLottoNumbersAsIntegerList());
        }
    }

    public static void winningNumber () {
        System.out.println("지난 주 당첨 번호를 입력해 주세요.");
    }
    public static void inputWinningNumber (List<Integer> winningNumber) {
        System.out.println(winningNumber);
    }

}
