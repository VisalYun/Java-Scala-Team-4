import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class JavaHashSet {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> ansArr = new ArrayList<>();
        HashSet<String> hs = new HashSet<>();
        int n = s.nextInt();
        s.nextLine();
        for(int i=0; i<n; i++){
            hs.add(s.nextLine());
            System.out.println(hs.size());
            ansArr.add(hs.size());
        }

    }
}
