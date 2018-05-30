import java.util.Arrays;
import java.util.Scanner;

public class Zadanie14 {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String[] imia = new String[5];
        int a = 0;


        while (a < imia.length) {
            System.out.println("podaj imie");
            imia[0 + a] = scanner.nextLine();
            a++;
        }
        int x = 0;
        while (x < 5) {
            System.out.println("cześć " + imia[4 - x]);
            x++;
        }
        System.out.println(Arrays.toString(imia));


    }
}


