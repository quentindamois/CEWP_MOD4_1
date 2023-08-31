import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter A temperature");
        Substance s = new Substance(input.nextDouble());
        String boiling = "";
        String freezing = "";
        if(s.isEthylFreezing()) {
            freezing += "Ethyl Alcohol ,";
        }
        else {
            if(s.isEthylBoiling()) {
                boiling += "Oxygen ,";
            }
        }
        if(s.isOxygenFreezing()) {
            freezing += "Oxygen ,";
        }
        else {
            if(s.isOxygenBoiling()) {
                boiling += "Oxygen ,";
            }
        }
        if(s.isWaterFreezing()) {
            freezing += "Water ,";
        }
        else {
            if(s.isWaterBoiling()) {
                boiling += "Water ,";
            }
        }
        if (freezing != "") {
            freezing = freezing[:-1];
            freezing += "are freezing.";
            System.out.println(freezing);
        }
        if(boiling != "") {
            boiling = boiling[:-1];
            boiling += "are boiling.";
            System.out.println(boiling);
        }
    }
}