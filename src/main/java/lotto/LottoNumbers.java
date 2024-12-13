package lotto;

import java.util.List;
import java.util.Objects;

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


}
