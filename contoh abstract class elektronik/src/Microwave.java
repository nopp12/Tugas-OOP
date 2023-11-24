class Microwave extends ElectronicDevice {
    public void turn_on() {
        System.out.println("Microwave dinyalakan.");
    }

    public void turn_off() {
        System.out.println("Microwave dimatikan.");
    }

    public void set_timer(int menit) {
        System.out.println("Timer microwave diatur selama " + menit + " menit.");
    }
}
