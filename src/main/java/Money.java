public abstract  class Money {
    protected int amount;

    static Dollar dollar(int amount) {
        return new Dollar(amount);
    }

    @Override
    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount && getClass().equals(money.getClass());
    }
}
