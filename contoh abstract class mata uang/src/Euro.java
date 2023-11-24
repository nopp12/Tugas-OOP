<<<<<<< HEAD
class Euro extends Currency {
    public Euro(double nilai) {
        super(nilai);
    }

    public double convert_to_base_currency() {
        // Misalkan 1 Euro = 16,500 IDR
        return nilai * 16500;
    }

    public double exchange_currency(double amount, Currency other) {
        // Misalkan 1 Euro = 1.18 USD
        return amount * 1.18;
    }

    public double get_exchange_rate(Currency other) {
        // Misalkan 1 Euro = 1.18 USD
        return 1.18;
    }
}
=======
class Euro extends Currency {
    public Euro(double nilai) {
        super(nilai);
    }

    public double convert_to_base_currency() {
        // Misalkan 1 Euro = 16,500 IDR
        return nilai * 16500;
    }

    public double exchange_currency(double amount, Currency other) {
        // Misalkan 1 Euro = 1.18 USD
        return amount * 1.18;
    }

    public double get_exchange_rate(Currency other) {
        // Misalkan 1 Euro = 1.18 USD
        return 1.18;
    }
}
>>>>>>> 0de9f9a02b7c32841af295b60b5ed667dffff3a1
