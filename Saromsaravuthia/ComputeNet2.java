import java.util.Scanner;

public class ComputeNet2 {
    public static void main(String args []){
        Double payRate, workHour, grossPay, netPay;
        Double withHolding=0.;
        Integer Tax;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the hourly pay rate: ");
        payRate = scan.nextDouble();
        System.out.println("Enter amount of worked hours: ");
        workHour = scan.nextDouble();
        grossPay = payRate * workHour;
        System.out.println("Your Gross Pay is: "+grossPay+"$" );
        if(grossPay<=300) {
            withHolding = (grossPay * 10)/100;
        }
        else if(300<grossPay&&grossPay<=400){
            withHolding = (grossPay * 12 )/100;
        }
        else if(400<grossPay&&grossPay<=500){
            withHolding = (grossPay * 15 )/100;
        }
        else if(500<grossPay){
            withHolding = (grossPay * 20 )/100;
        }
        System.out.printf("Your withholding tax is: %s%n", withHolding);
        netPay = grossPay - withHolding;
        System.out.println("Your Net pay is: "+netPay);
    }
}
