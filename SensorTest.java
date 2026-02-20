import java.util.Scanner;

public class SensorTest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Sensor[] sensors = new Sensor[5];
        double total = 0;

        for (int i = 0; i < sensors.length; i++) {
            System.out.print("Enter Location for sensor " + (i + 1) + ": ");
            String loc = input.nextLine();

            System.out.print("Enter the temperature (-50.0 до 50.0): ");
            double temp = input.nextDouble();
            input.nextLine();

            sensors[i] = new Sensor(loc, temp);
            total += sensors[i].getReading();
        }

        double average = total / sensors.length;
        System.out.println("\nAverage temperature for all sensors: " + average);
    }
}