package ict.kosovo.growth.advance.nested_class.anonymous_class;

import java.math.BigDecimal;

public class OnlineOrder extends Order {
    @Override
    public BigDecimal getDiscount() {
        //0-50%
        return BigDecimal.valueOf(Math.random()*51);
    }
}
