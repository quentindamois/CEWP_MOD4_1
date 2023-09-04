import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Substance s;
        do{
            System.out.println("Enter A temperature:");
            s = new Substance(input.nextDouble());
            if(s.getTemperature() < -459.67){
                System.out.println("Temperature too low!");
            }
        }while(s.getTemperature() < -459.67);

        if(s.isEthylFreezing()) {
            System.out.println("Ethyl Alcohol is freezing.");
        }
        else {
            if(s.isEthylBoiling()) {
                System.out.println("Ethyl Alcohol is boiling.");
            }
        }
        if(s.isOxygenFreezing()) {
            System.out.println("Oxygen is freezing.");
        }
        else {
            if(s.isOxygenBoiling()) {
                System.out.println("Oxygen is boiling");
            }
        }
        if(s.isWaterFreezing()) {
            System.out.println("Water is freezing.");
        }
        else {
            if(s.isWaterBoiling()) {
                System.out.println("Water is boiling");
            }
        }
    }
}