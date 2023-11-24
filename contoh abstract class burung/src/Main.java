public class Main {
    public static void main(String[] args) {
        BurungDarat burungDarat = new BurungDarat("Puyuh", 2);
        burungDarat.suara();
        burungDarat.terbang();

        BurungAir burungAir = new BurungAir("Penguin", 3);
        burungAir.suara();
        burungAir.terbang();
    }
}