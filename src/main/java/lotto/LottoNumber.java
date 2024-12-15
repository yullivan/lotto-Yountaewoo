package lotto;

import java.util.Objects;

public class LottoNumber {
    private int number;

    public LottoNumber(int number) {
        if (number < 0 || number > 45) {
            throw new IllegalArgumentException("[ERROR] 로또의 번호는 1과 45 사이입니다.");
        }
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LottoNumber that = (LottoNumber) o;
        return number == that.number;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(number);
    }

    public int getNumber() {
        return number;
    }

}
