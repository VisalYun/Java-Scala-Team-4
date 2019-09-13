import java.util.Scanner;

public class SwimmingPool {
    public static void main(String args[])
    {
        Double length, width, depth, poolVol, poolCap, fillingTime, fillingFee, total;
        Scanner scan = new Scanner(System.in);
        System.out.println("Pool Information");
        System.out.println("Length: ");
        length = scan.nextDouble();
        System.out.println("Width: ");
        width = scan.nextDouble();
        System.out.println("Average Depth: ");
        depth = scan.nextDouble();
        poolVol = length*width*depth;
        poolCap = poolVol * 7.5;
        fillingTime = poolCap / 3000;
        fillingFee = fillingTime * 8;
        System.out.println("We have to spent "+fillingTime+" hours to fill this pool");
        System.out.println("And the fee is "+ fillingFee+"$");
        System.out.println("Cleaning fee is 75$");
        total = fillingFee + 75;
        System.out.println("Total: "+total+"$");

    }
}
