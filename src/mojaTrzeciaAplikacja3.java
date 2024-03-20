import java.util.Scanner;


public class mojaTrzeciaAplikacja3 {
    public static void main(String[] args) {


        Scanner wczytaj=new Scanner(System.in);
        int x;
        System.out.print("Podaj liczbę:");
        x= wczytaj.nextInt();


        var result = (1.8 * x) + 32.0 ;
        System.out.println("(1.8 * x) + 32.0 =  " + result + " Fahrenheit");

        result = x + 273.16 ;
        System.out.println("x + 273.16 =  " + result + " Kelwin");


        {
            System.out.println("Wpisz wartość -1 żeby wyjść z programu.");
            var input = wczytaj.nextDouble();
            if(input == -1){
                System.out.println("Wyjście...");
            }
        }
        wczytaj.close();
    }
    }
