package pl.jzajas.creditcard;

import java.math.BigDecimal;

public class CreditCard {

    private BigDecimal creditLimit;

    public BigDecimal getBalance() {
        return creditLimit;
    }

    public void assignCredit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }
}
