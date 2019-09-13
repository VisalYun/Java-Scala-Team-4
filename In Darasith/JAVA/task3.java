package GroupExercise;//HashSet String counting Size
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class task3 {
    public static void main(String args[]){

        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();
        inp.nextLine();

        HashSet<String> hashset = new HashSet<>();
        ArrayList<Integer> arraylist = new ArrayList<>();

        for (int i=0;i<n;i++){
            hashset.add(inp.nextLine());
            arraylist.add(hashset.size());
        }
        System.out.println(arraylist);

    }
}
