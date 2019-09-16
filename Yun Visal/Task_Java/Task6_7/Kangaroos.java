import java.util.Scanner;

public class Kangaroos {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x1 = s.nextInt();
        int v1 = s.nextInt();
        int x2 = s.nextInt();
        int v2 = s.nextInt();

        while(x2>x1){
            x2+=v2;
            x1+=v1;
        }
        if(x1==x2){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}
