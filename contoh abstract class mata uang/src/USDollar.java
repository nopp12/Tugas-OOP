class USDollar extends Currency {
    public USDollar(double nilai) {
        super(nilai);
    }

    public double convert_to_base_currency() {
        return nilai * 14000;
    }

    public double exchange_currency(double amount, Currency other) {
        return amount * 0.85;
    }

    public double get_exchange_rate(Currency other) {
        return 0.85;
    }
}
