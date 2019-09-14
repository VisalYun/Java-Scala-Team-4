package Task_Java.Task1;
import java.util.ArrayList;
import java.util.Scanner;

public class Riels_to_Dollars {
    public static void main(String[] args) {
        int TwoT;
        int OneT;
        int FiveH;
        int OneH;
        int checked=0;
        ArrayList<String> display = new ArrayList<String>();

        Scanner s = new Scanner(System.in);
        System.out.print("Enter dollar money: ");
        Double dollar = s.nextDouble();
        Double riel = dollar * 4000;

        System.out.print("Enter the amount of 2000s: ");
        TwoT = s.nextInt();
        System.out.print("Enter the amount of 1000s: ");
        OneT = s.nextInt();
        System.out.print("Enter the amount of 500s: ");
        FiveH = s.nextInt();
        System.out.print("Enter the amount of 100s: ");
        OneH = s.nextInt();

        if(TwoT!=0){
            checked += TwoT * 2000;
            display.add("2000 x "+ TwoT+ " ="+ TwoT*2000);
        }
        if(OneT!=0){
            checked+=OneT * 1000;
            display.add("1000 x "+ OneT+ " ="+ OneT*1000);
        }
        if(FiveH!=0){
            checked+=FiveH*500;
            display.add("500 x "+ FiveH+ " ="+ FiveH*500);
        }
        if(OneH!=0){
            checked+=OneH*100;
            display.add("100 x "+ OneH+ " ="+ OneH*100);
        }

        if(checked==riel){
            for(String str:display){
                System.out.println(str);
            }
        }
        else{
            System.out.println("Invalid");
        }
    }
}
