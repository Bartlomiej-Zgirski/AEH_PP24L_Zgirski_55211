package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja2 {
    public static void main(String[] args) {

        double x = 10;  //utworzenie zmiennej typu double i przypisanie jej wrtości 10
        double y = 2;

        Scanner scanner = new Scanner(System.in);

        var result = x + y;
        System.out.println("x + y= " + result);

        result = x - y;
        System.out.println("x - y= " + result);

        result = x * y;
        System.out.println("x * y= " + result);

        result = x / y;
        System.out.println("x / y= " + result);

        result = x % y;
        System.out.println("x % y= " + result);

        System.out.println("Wpisz dwie liczby rozdzielone klawiszem Enter:");
        double first = scanner.nextDouble(); //prośba o wpisanie wartości typu double
        double second = scanner.nextDouble();

        System.out.println("x + y = " + (first + second));
    }

}