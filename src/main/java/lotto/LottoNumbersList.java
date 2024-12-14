package lotto;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class LottoNumbersList {
    private List<LottoNumbers> lottoNumbersList;

    public LottoNumbersList(List<LottoNumbers> lottoNumbersList) {
        this.lottoNumbersList = lottoNumbersList;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumbersList that = (LottoNumbersList) o;
        return Objects.equals(lottoNumbersList, that.lottoNumbersList);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lottoNumbersList);
    }

    public List<LottoNumbers> getLottoNumbersList() {
        return lottoNumbersList;
    }

    // 구매한 갯수만큼 랜덤으로 로또를 뽑는 함수
    public static List<LottoNumbers> purchasedLottonList (Price price) {
        List<LottoNumbers> purchasedLottonList = new ArrayList<>();
        for (int i = 1; i <= price.getPrice() / 1000 ; i++) {
            purchasedLottonList.add(LottoNumbers.randomNumbers());
        }
        return purchasedLottonList;
    }
}
