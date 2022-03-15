import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        int wysokosc;
        Scanner pobieranie = new Scanner(System.in);
        wysokosc=pobieranie.nextInt();
        for(int i =0 ; i <= wysokosc;i++)
        {
            for(int j =0; j <= i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

    }
}