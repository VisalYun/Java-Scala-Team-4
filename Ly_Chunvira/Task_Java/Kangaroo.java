import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int v1 = s.nextInt();
        int x2 = s.nextInt();
        int v2 = s.nextInt();
        boolean x1IsGreater = x1 > x2;

        do{
            x1 += v1;
            x2 += v2;
            if(x1 > x2 != x1IsGreater || x1 == x2){
                break;
            }
        }while(true);

        System.out.println(x1==x2?"YES":"NO");
    }
}
