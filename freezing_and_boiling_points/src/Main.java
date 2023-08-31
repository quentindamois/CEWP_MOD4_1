import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A temperature");
        Substance s = new Substance(input.nextDouble());
        String boiling = "";
        String freezing = "";
        if(s.isEthylFreezing()) {
            freezing += "Ethyl Alcohol is freezing.";
        }
        else {
            if(s.isEthylBoiling()) {
                boiling += "Ethyl Alcohol is boiling.";
            }
        }
        if(s.isOxygenFreezing()) {
            freezing += "Oxygen is freezing.";
        }
        else {
            if(s.isOxygenBoiling()) {
                boiling += "Oxygen is boiling";
            }
        }
        if(s.isWaterFreezing()) {
            freezing += "Water is freezing.";
        }
        else {
            if(s.isWaterBoiling()) {
                boiling += "Water is boiling";
            }
        }
    }
}