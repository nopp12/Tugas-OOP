public class Main {
    public static void main(String[] args) {
        Primata primataku = new Primata("Orangutan", 5);
        primataku.suara();
        primataku.menyusui();

        Karnivora carnivoraKu = new Karnivora("Singa", 3);
        carnivoraKu.suara();
        carnivoraKu.menyusui();
    }
}