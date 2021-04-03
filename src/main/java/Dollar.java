class Dollar extends Money {
    private String currency;

    Dollar(int amount, String currency) {
        this.amount = amount;
        currency = "USD";
    }

    Money times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }

    String currency() {
        return currency;
    }
}