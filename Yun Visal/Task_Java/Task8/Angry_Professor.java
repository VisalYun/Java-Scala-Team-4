package Pratical_test;

import java.util.Scanner;

public class Angry_Professor {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int flag =0;
        String str = "";
        int T = s.nextInt();
        int nextT = T-1;
        while(T>0){
            if(T>nextT){
                s.nextLine();
                str = s.nextLine();
            }
            else{
                str = s.nextLine();
            }
            String[] student = str.split(" ");
            int total = Integer.parseInt(student[0]);
            int expect = Integer.parseInt(student[1]);
            if(total>=expect){
                String t = s.nextLine();
                String[] time = t.split(" ");
                if(time.length==total){
                    for(String sot: time) {
                        if (Integer.parseInt(sot)>0){
                            flag++;
                        }
                        else {
                            continue;
                        }
                    }
                }
                else{
                    System.out.println("Invalid Input");
                }

                if(flag>=expect){
                    System.out.println("NO");
                }
                else{
                    System.out.println("Yes");
                }

                T--;
            }
            else {
                System.out.println("Invalid Input");
            }
        }
    }
}
