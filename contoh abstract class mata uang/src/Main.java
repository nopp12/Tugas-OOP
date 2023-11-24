<<<<<<< HEAD
public class Main {
    public static void main(String[] args) {
        USDollar myDollar = new USDollar(100);
        System.out.println("100 USD dalam IDR: " + myDollar.convert_to_base_currency());

        Euro myEuro = new Euro(100);
        System.out.println("100 Euro dalam IDR: " + myEuro.convert_to_base_currency());

        System.out.println("100 USD dalam Euro: " + myDollar.exchange_currency(100, myEuro));
        System.out.println("100 Euro dalam USD: " + myEuro.exchange_currency(100, myDollar));
    }
}
=======
public class Main {
    public static void main(String[] args) {
        USDollar myDollar = new USDollar(100);
        System.out.println("100 USD dalam IDR: " + myDollar.convert_to_base_currency());

        Euro myEuro = new Euro(100);
        System.out.println("100 Euro dalam IDR: " + myEuro.convert_to_base_currency());

        System.out.println("100 USD dalam Euro: " + myDollar.exchange_currency(100, myEuro));
        System.out.println("100 Euro dalam USD: " + myEuro.exchange_currency(100, myDollar));
    }
}
>>>>>>> 0de9f9a02b7c32841af295b60b5ed667dffff3a1
