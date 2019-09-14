package Task_Java.Task1;
import java.util.Scanner;

public class Validate_ticket_number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter ticket number: ");
        int ticket = s.nextInt();
        int remainder = ticket%10;
        System.out.println(checked(ticket,remainder));
    }

    private static boolean checked(int a, int b){
        if((a/10)%7 == b){
            return  true;
        }
        else return false;
    }
}
