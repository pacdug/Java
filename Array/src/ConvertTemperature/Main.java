package ConvertTemperature;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double Celsius , fahrenheit;
        int choice;

        convertTemperature ConvertTemp = new convertTemperature();

        do{
            System.out.println("Menu:");
            System.out.println("1. Convert temperature to Fahrenheit");
            System.out.println("2. Convert temperature to Celsius");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = sc.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter Celsius :");
                    Celsius = sc.nextDouble();
                    System.out.println("Celsius to Fahrenheit:" + ConvertTemp.celsiusToFahrenheit(Celsius));
                    break;
                case 2:
                    System.out.println("Enter fahrenheit :");
                    fahrenheit = sc.nextDouble();
                    System.out.println("Fahrenheit to Celsius :" + ConvertTemp.fahrenheitToCelsius(fahrenheit));
                    break;
                case 0:
                    System.exit(0);
            }
        }while(choice != 0);
    }
}
