import java.util.Scanner;


public class mojaTrzeciaAplikacja2 {
    public static void main(String[] args) {


        Scanner wczytaj=new Scanner(System.in);
        int a;
        System.out.print("Podaj liczbę: ");
        a= wczytaj.nextInt();

        Scanner scanner = new Scanner(System.in);

        var result = a / 7;
        System.out.println("a / 7 = " + result);

       var result1 = a % 7;
        System.out.println("a % 7 = " + result1);

        System.out.println(+a+ " dni to " + result + " tygodni/e i " + result1 + " dni. ");


        }

        }

