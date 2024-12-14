package lotto;

public class Application {

    public static void main(String[] args) {
        //구매금액을 입력하라는 문구를 출력
        Output.purchasePrice();
        //구매금액을 입력받기 & 입력받은 금액 Price 에 기억시키기
        Price purchasedPrice = new Price(Input.purchasePrice());
        //구매한 금액 출력
        Output.purchasedPrice(purchasedPrice);
        //구매한 갯수 출력
        Output.purchasedMount(purchasedPrice);
        //구매한 로또 번호들 나열
        Output.purchasedLottoList(purchasedPrice);
        //당첨번호들 물어보기
        Output.winningNumber();
        //당첨번호 입력 받기 & LottoNumbers 로 바꾸기
        LottoNumbers.changeInteger(Input.winningNumbers());

    }

}
