package lotto;

import java.util.*;

public class LottoNumbers {
    private List<LottoNumber> lottoNumbers;

    public LottoNumbers(List<LottoNumber> lottoNumbers) {
        if (lottoNumbers == null || lottoNumbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또의 번호들은 총 6개 입니다.");
        }
        this.lottoNumbers = new ArrayList<>(lottoNumbers);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumbers that = (LottoNumbers) o;
        return Objects.equals(lottoNumbers, that.lottoNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lottoNumbers);
    }

    public List<LottoNumber> getLottoNumbers() {
        return lottoNumbers;
    }

    public List<Integer> getLottoNumbersAsIntegerList() {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (LottoNumber lottoNumber : lottoNumbers) {
            numbers.add(lottoNumber.getNumber());
        }
        return numbers;
    }

    //당첨 번호와 일치한 번호들 찾는 함수
    public List<LottoNumber> matchNumbers(List<LottoNumber> answer) {
        this.lottoNumbers.retainAll(answer);
        return this.lottoNumbers;
    }

    //랜덤으로 6개의 번호를 뽑는 함수
    public static LottoNumbers randomNumbers() {
        List<Integer> oneFourtyFive = new ArrayList<>();
        for (int i = 1; i < 46; i++) {
            oneFourtyFive.add(i);
        }
        Collections.shuffle(oneFourtyFive);

        List<LottoNumber> randomNumbers = new ArrayList<>();
        for (int i = 0; i < 6; i++) {
            randomNumbers.add(new LottoNumber(oneFourtyFive.get(i)));
        }
        return new LottoNumbers(randomNumbers);
    }

    //Integer 리스트를 로또 번호로 바꾸는 함수
    public static LottoNumbers changeInteger (List<Integer> winningNumber) {
        List<LottoNumber> numbers = new ArrayList<>();
        for (Integer number : winningNumber) {
            numbers.add(new LottoNumber(number));
        }
        LottoNumbers changeInteger = new LottoNumbers(numbers);
        return changeInteger;
    }
}
