package lotto;

import java.util.Objects;

public class Price {
    int price;

    public Price(int price) {
        if (price < 1000 || price % 1000 != 0) {
            throw new IllegalArgumentException("[ERROR] 로또는  1000원단위입니다.");
        }
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Price price1 = (Price) o;
        return price == price1.price;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(price);
    }

    public int getPrice() {
        return price;
    }
}
