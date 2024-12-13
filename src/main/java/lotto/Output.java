package lotto;

public class Output {
    public static void purchasePrice () {
        System.out.println("구입금액을 입력해 주세요.");
    }
    public static void purchasedPrice (Price price) {
        System.out.println(price.getPrice());
    }

}
