import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a temperature in Fahrenheit : ");
        Temperature t = new Temperature(input.nextDouble());
        System.out.println("Temperature in Celsius : " + t.getCelsius());
        System.out.println("Temperature in Kelvin : " + t .getKelvin());
    }
}