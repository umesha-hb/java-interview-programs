package com.interview.infosys;

import java.math.BigDecimal;
import java.util.Objects;

public final class Money {

    private final BigDecimal amount;
    private final Currency currency;

    public Money(BigDecimal amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    public Money add(Money other) {
        validateCurrency(other);
            return new  Money(this.amount.add(other.amount),this.currency);
    }

    public Money subtract(Money other) {
        validateCurrency(other);

        return new Money(
                this.amount.subtract(other.amount),
                this.currency
        );
    }

    private void validateCurrency(Money other) {
        if (!this.currency.equals(other.currency)) {
            throw new IllegalArgumentException(
                    "Currency mismatch: " + this.currency + " and " + other.currency
            );
        }
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;
        Money money = (Money) o;
        return amount.equals(money.amount) &&
                currency == money.currency;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, currency);
    }
}
