public class Main {
    public static void main(String[] args) {
        CPU myCPU = new CPU();
        myCPU.power_on();
        myCPU.test();
        myCPU.power_off();

        RAM myRAM = new RAM();
        myRAM.power_on();
        myRAM.test();
        myRAM.power_off();

        GPU myGPU = new GPU();
        myGPU.power_on();
        myGPU.test();
        myGPU.power_off();
    }
}