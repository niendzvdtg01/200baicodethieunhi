/**
 * Money
 */
public final class Money {
    private final long amountCents;
    private final String currency;

    public Money(long amountCents, String currency) {
        if (amountCents < 0)
            throw new IllegalArgumentException("amount < 0");
        this.amountCents = amountCents;
        this.currency = currency;
    }

    public long getAmountCents() {
        return this.amountCents;
    }

    public String getCurrency() {
        return this.currency;
    }

    // Thay doi tao object moi khong sua object hien tai
    public Money add(Money others) {
        if (!this.currency.equals(others.getCurrency()))
            throw new IllegalArgumentException("the currency mismatch!");
        return new Money(this.amountCents + others.getAmountCents(), others.getCurrency());
    }

    @Override
    public String toString() {
        return amountCents + " " + currency;
    }

    public static void main(String[] args) {
        Money a = new Money(10000, "USD");
        Money b = new Money(15000, "USD");
        var total = a.add(b);
        System.out.println(total);
    }
}