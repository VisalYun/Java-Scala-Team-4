import java.util.Scanner;

public class TicketNumber {

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int ticketNumber = s.nextInt();
        System.out.println(isValidTicket(ticketNumber));
    }

    static boolean isValidTicket(int ticket){
        int lastDigit = ticket % 10;
        int leftTicket = ticket / 10;
        return leftTicket % 7 == lastDigit;
    }

}
