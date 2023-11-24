class Televisi extends ElectronicDevice {
    public void turn_on() {
        System.out.println("Televisi dinyalakan.");
    }

    public void turn_off() {
        System.out.println("Televisi dimatikan.");
    }

    public void set_timer(int menit) {
        System.out.println("Timer televisi diatur selama " + menit + " menit.");
    }
}