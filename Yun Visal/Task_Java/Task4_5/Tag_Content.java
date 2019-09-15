import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Tag_Content {
    public static void main(String[] args) {
        Scanner s  = new Scanner(System.in);
        int n = s.nextInt();
        while (n > 0) {
            String str = s.nextLine();
            Pattern format = Pattern.compile("<(.+)>([^<]+)</\\1>");
            //.+ = any character that occur more than one time
            // () = group particular subsequence of the string
            // \1 = group 1
            Matcher m = format.matcher(str);
            if(m.find()){
                System.out.println(m.group(2));
            }
            else {
                System.out.println("None");
            }
            n--;
        }
    }
}
