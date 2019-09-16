import java.util.Scanner;

public class Open_Book {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();

        int begining = p/2;
        int end = 0;

        if(n%2==1){
            end = (n-p)/2;
        }
        else{
            end = (int)Math.ceil((n-p)/2.0);
        }

        System.out.println(Math.min(begining,end));
    }
}
