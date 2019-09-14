package Task_Java.Task1;
import java.util.Scanner;

public class Credit {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter credit hours: ");
        int cr = s.nextInt();
        System.out.println("Enter the amount of money spent on books: ");
        int b = s.nextInt();
        int pcr = cr*85;
        int tot = pcr+b+65;

        System.out.println("The student enrolled "+cr +" credit hours and 85$ per credit hour = "+ pcr);
        System.out.println("Plus $"+b+" spent on books = " +b);
        System.out.println("Plus a $65 on athletic fee");
        System.out.println("--> Total: $"+tot);
    }
}
