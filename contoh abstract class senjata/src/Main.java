public class Main {
    public static void main(String[] args) {
        SenjataApi myGun = new SenjataApi();
        myGun.fire();
        myGun.reload();
        myGun.aim();

        Panah myBow = new Panah();
        myBow.fire();
        myBow.reload();
        myBow.aim();
    }
}