public class Main {
    public static void main(String[] args) {
        Apel apelku = new Apel("Apel", 0.5, "manis", "Vitamin C");
        apelku.tumbuh();
        apelku.matang();

        Jeruk jerukku = new Jeruk("Jeruk", 0.3, "asam dan manis", "Vitamin C dan Kalsium");
        jerukku.tumbuh();
        jerukku.matang();
    }
}