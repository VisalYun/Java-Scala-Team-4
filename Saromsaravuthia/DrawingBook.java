import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DrawingBook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int BookPage  = in.nextInt();
        int TargetPage = in.nextInt();

        int beg = (TargetPage/2);
        int end = 0;
        if(BookPage%2==1)
            end = (BookPage-TargetPage)/2;
        else
            end = (int) Math.ceil((BookPage-TargetPage)/2.0);

        System.out.println(Math.min(beg,end));
    }
}