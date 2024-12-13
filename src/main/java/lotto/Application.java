package lotto;

public class Application {

    public static void main(String[] args) {
        //구매금액을 입력하라는 문구를 출력
        Output.purchasePrice();
        //구매금액을 입력받기 & 입력받은 금액 Price 에 기억시키기
        Price puchasedPrice = new Price(Input.purchasePrice());

    }

}
