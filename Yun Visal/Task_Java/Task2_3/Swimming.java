package Task_Java.Task2_3;
import java.util.Scanner;
public class Swimming {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Length: ");
        var length = s.nextDouble();
        System.out.println("Width: ");
        var width = s.nextDouble();
        System.out.println("Depth: ");
        var depth = s.nextDouble();

        var volume = length*width*depth;
        var gallons = volume * 7.5;
        var time = gallons/50;
        var Fillup_price = (time/60)*8;

        var total_price = Fillup_price + 75;

        System.out.println("Fee for cleaning: $75");
        System.out.println("Fee for filling up the water:" + Fillup_price);
        System.out.println("--------------------------------------------");
        System.out.println("Total fee: "+total_price);
    }
}
