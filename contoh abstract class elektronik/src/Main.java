public class Main {
    public static void main(String[] args) {
        Televisi myTV = new Televisi();
        myTV.turn_on();
        myTV.set_timer(60);
        myTV.turn_off();

        Microwave myMicrowave = new Microwave();
        myMicrowave.turn_on();
        myMicrowave.set_timer(15);
        myMicrowave.turn_off();
    }
}