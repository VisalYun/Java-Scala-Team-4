package Pratical_test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Electronic_Shop {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> temp = new ArrayList<Integer>();

        String[] detail = s.nextLine().split(" ");
        int amount = Integer.parseInt(detail[0]);
        int k_brand = Integer.parseInt(detail[1]);
        int u_brand = Integer.parseInt(detail[2]);

        String[] k_price = s.nextLine().split(" ");
        String[] u_price = s.nextLine().split(" ");

        if(k_brand!=k_price.length){
            System.out.println(-1);
        }
        else{
            if(u_brand!=u_price.length){
                System.out.println(-1);
            }
            else{
                for(String k: k_price){
                    for(String u:u_price){
                        if(Integer.parseInt(k)+Integer.parseInt(u)<=amount) {
                            temp.add(Integer.parseInt(k) + Integer.parseInt(u));
                        }
                    }
                }
                System.out.println(Collections.max(temp));
            }
        }
    }
}