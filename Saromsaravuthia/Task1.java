import java.util.Scanner;

public class Task1 {
    public static void main(String[] args )
    {
        Scanner scan = new Scanner(System.in);
        var BookPrice = 12;
        System.out.println("Enter the amount of credit hour: ");
        var CreditHour = scan.nextInt();
        System.out.println("Number of books that you buy: ");
        var BookNum = scan.nextInt();
        var AtlethicFee = 65;
        var CreditPrice = CreditHour * 85;
        var BookPriceTotal = BookPrice*BookNum;
        var Total = AtlethicFee + CreditPrice + BookPrice;
        System.out.println("Total price of Credit Hour: "+ CreditPrice+"$");
        System.out.println("Amount of money spent on books: "+BookPrice+"$");
        System.out.println("Athletic Fee: "+AtlethicFee+"$");
        System.out.println("Total: "+Total+"$");
    }
}
