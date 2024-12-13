package lotto;

import java.util.*;

public class LottoNumbers {
    private List<LottoNumber> lottoNumbers;

    public LottoNumbers(List<LottoNumber> lottoNumbers) {
        if (lottoNumbers.size() != 6) {
            throw new IllegalArgumentException("[ERROR] 로또의 번호들은 총 6개 입니다.");
        }
        this.lottoNumbers = lottoNumbers;
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

    //당첨 번호와 일치한 번호들 찾는 함수
    public List<LottoNumber> matchNumbers (List<LottoNumber> answer) {
        this.lottoNumbers.retainAll(answer);
        return this.lottoNumbers;
    }

    //랜덤으로 6개의 번호를 뽑는 함수
    public List<LottoNumber> randomNumbers () {
        List<Integer> oneFourtyfive = new ArrayList<>();
        for (int i = 1; i < 46; i++) {
            oneFourtyfive.add(i);
        }
        Collections.shuffle(oneFourtyfive);
        oneFourtyfive.subList(0,6);
        List<LottoNumber> randomNumbers = new ArrayList<>();
        for (Integer i : oneFourtyfive) {
            randomNumbers.add(new LottoNumber(i));
        }
        return randomNumbers;
    }


}
