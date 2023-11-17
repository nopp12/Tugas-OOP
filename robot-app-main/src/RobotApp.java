import java.util.Scanner;
import Model.Layout;
import Model.Position;
import Model.Robot;

public class RobotApp {
    private Layout layout;
    private Robot robot;
    private Scanner scanner;

    public RobotApp() {
        this.layout = new Layout(10, 10, '*');
        this.robot = new Robot('o', new Position(1, 1));
        this.scanner = new Scanner(System.in);
        String instruction = "";
        System.out.println("-------- Permainan Dimulai --------");
        do {
            draw();
            instruction = waitInstruction();
            moveRobot(instruction);
        } while (!instruction.equals("x"));
        System.out.println("-------- Permainan Selesai --------");
    }

    private String waitInstruction() {
        System.out.println("-------- Instruksi --------");
        System.out.println("Instruksi: {d=kanan/a=kiri/w=atas/s=bawah}{jumlah langkah}");
        System.out.println("Contoh: w3 berarti 'keatas 3 langkah'");
        System.out.print("Masukan instruksi: ");
        return scanner.nextLine();
    }

    private void moveRobot(String instruction) {
        char direction = instruction.charAt(0);
        int steps = Integer.parseInt(instruction.substring(1));
        switch (direction) {
            case 'w':
                if (robot.getPosition().getY() - steps >= 0) {
                    robot.getPosition().setY(robot.getPosition().getY() - steps);
                } else {
                    System.out.println("Robot tidak bisa bergerak ke atas sebanyak " + steps + " langkah");
                }
                break;
            case 'a':
                if (robot.getPosition().getX() - steps >= 0) {
                    robot.getPosition().setX(robot.getPosition().getX() - steps);
                } else {
                    System.out.println("Robot tidak bisa bergerak ke kiri sebanyak " + steps + " langkah");
                }
                break;
            case 's':
                if (robot.getPosition().getY() + steps < layout.getMaxY()) {
                    robot.getPosition().setY(robot.getPosition().getY() + steps);
                } else {
                    System.out.println("Robot tidak bisa bergerak ke bawah sebanyak " + steps + " langkah");
                }
                break;
            case 'd':
                if (robot.getPosition().getX() + steps < layout.getMaxX()) {
                    robot.getPosition().setX(robot.getPosition().getX() + steps);
                } else {
                    System.out.println("Robot tidak bisa bergerak ke kanan sebanyak " + steps + " langkah");
                }
                break;
            default:
                System.out.println("Instruksi tidak valid");
                break;
        }
    }

    private void draw() {
        System.out.println("------ Posisi Terbaru ------");
        for (int i = 0; i < layout.getMaxY(); i++) {
            for (int j = 0; j < layout.getMaxX(); j++) {
                if (i == robot.getPosition().getY() && j == robot.getPosition().getX()) {
                    System.out.print(robot.getIcon());
                } else {
                    System.out.print(layout.getArea()[i][j]);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new RobotApp();
    }
}
