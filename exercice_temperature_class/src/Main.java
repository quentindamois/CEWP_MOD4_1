import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit: ");
        Temperature t = new Temperature(input.nextDouble());
        while (t.getFahrenheit() < -459.67) {
            System.out.printf("ERROR: %.2f is below the absolute zero which is - 459.67.\nEnter a temperature in Fahrenheit:\n", t.getFahrenheit());
            t = new Temperature(input.nextDouble());
        }
        System.out.println("Temperature in Celsius: " + t.getCelsius());
        System.out.println("Temperature in Kelvin: " + t .getKelvin());
    }
}