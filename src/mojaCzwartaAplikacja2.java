import java.util.Scanner;


public class mojaCzwartaAplikacja2 {
    public static void main(String[] args) {


        Scanner wczytaj = new Scanner(System.in);
        int x;
        System.out.print("Podaj liczbę x: ");
        x = wczytaj.nextInt();

        int y;
        System.out.print("Podaj liczbę y: ");
        y = wczytaj.nextInt();

        {
            char znak;
            Scanner wej = new Scanner(System.in);

            System.out.println("Naciśnij +, jeśli chcesz dodać liczby: ");
            System.out.println("Naciśnij -, jeśli chcesz odjąć liczby: ");
            System.out.println("Naciśnij *, jeśli chcesz pomnożyć liczby: ");
            System.out.println("Naciśnij /, jeśli chcesz podzielić liczby: ");

            znak = wej.next().charAt(0);
            switch(znak)
            {
                case '+':
                {
                    System.out.println(x + y);
                    break;
                }
                case '-':
                {
                    System.out.println(x - y);
                    break;
                }
                case '*':
                {
                    System.out.println(x * y);
                    break;
                }
                case '/':
                    if(y !=0)
                    {
                        System.out.println(x / y + "oraz reszty: " +
                                x % y);
                    }
                    else
                    {
                        System.out.println("Nie dzielimy przez zero!!!");
                    }
                    break;

                    }

                    }
                }

            }











