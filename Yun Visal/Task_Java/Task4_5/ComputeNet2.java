package Task_Java.Task4_5;

import java.util.Scanner;

public class ComputeNet2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Hour Pay rate: ");
        var HPR = s.nextDouble();
        System.out.println("Working hour: ");
        var H = s.nextInt();
        var pay = 0.0;

        var gross_pay = HPR*H;
        System.out.println("Gross Pay: $"+gross_pay);
        if(gross_pay<=300.0){
            System.out.println("Withholding tax: 10%");
            pay = gross_pay - ((gross_pay*10)/100);
        }
        else if(gross_pay<=400.0){
            System.out.println("Withholding tax: 12%");
            pay = gross_pay - ((gross_pay*12)/100);
        }
        else if(gross_pay<=500.0){
            System.out.println("Withholding tax: 15%");
            pay = gross_pay - ((gross_pay*15)/100);
        }
        else{
            System.out.println("Withholding tax: 20%");
            pay = gross_pay - ((gross_pay*20)/100);
        }
        System.out.println("Net Worth: $"+pay);
    }
}
