import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Substance s;
        do{
            System.out.println("Enter a temperature:");
            s = new Substance(input.nextDouble());
            if(s.getTemperature() < -459.67){
                System.out.println("Temperature too low!");
            }
        }while(s.getTemperature() < -459.67);

        if(s.isEthylFreezing()) {
            System.out.print("Ethyl Alcohol is freezing, ");
        }
        else {
            if(s.isEthylBoiling()) {
                System.out.print("Ethyl Alcohol is boiling, ");
            }
        }
        if(s.isOxygenFreezing()) {
            System.out.print("Oxygen is freezing, ");
        }
        else {
            if(s.isOxygenBoiling()) {
                System.out.print("Oxygen is boiling, ");
            }
        }
        if(s.isWaterFreezing()) {
            System.out.print("Water is freezing, ");
        }
        else {
            if(s.isWaterBoiling()) {
                System.out.print("Water is boiling, ");
            }
        }
        System.out.println("\b\b at this temperature.");
    }
}