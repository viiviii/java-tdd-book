public abstract class Money {
    protected int amount;
    protected String currency;

    static Money dollar(int amount) {
        return new Dollar(amount,"USD");
    }

    static Money franc(int amount) {
        return new Franc(amount);
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }

    abstract Money times(int multiplier);

    String currency() {
        return currency;
    }
}
