//Swimming pool exercise cost
package GroupExercise;

import java.util.Scanner;

public class task2 {
    public static void main(String args[]){
        double gal = 7.5;
        double clsprice = 75;
        double rateofflow = 50;
        double feeperhour = 8;
        Scanner inp = new Scanner(System.in);

        System.out.println("Enter the amount of length, width, dept");
        double length = inp.nextDouble();
        double width = inp.nextDouble();
        double dept = inp.nextDouble();

        System.out.println("volume of the pool");
        double volume = length * width * dept;
        System.out.println(volume);
        System.out.println("pool capacity");
        double poolcap = volume * gal;
        System.out.println(poolcap);
        System.out.println("time to fill-up pool");
        double time = volume / rateofflow;
        double hour = time/60;
        System.out.println(hour);
        System.out.println("price to pay in for hour");
        double pricetopayperhour = hour * feeperhour;
        System.out.println(pricetopayperhour);

        System.out.println("The total Price is:");
        double price = pricetopayperhour + clsprice;
        System.out.println(price+"$");

    }
}
