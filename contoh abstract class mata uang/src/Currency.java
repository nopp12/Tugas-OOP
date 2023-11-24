abstract class Currency {
    double nilai;

    public Currency(double nilai) {
        this.nilai = nilai;
    }

    public abstract double convert_to_base_currency();
    public abstract double exchange_currency(double amount, Currency other);
    public abstract double get_exchange_rate(Currency other);
}
