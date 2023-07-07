package soru;

import java.util.Scanner;

public class Soru_9 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int array[]=new int[10];
        int x=scan.nextInt();
        int y=(x/2)+1;
        int bolum=0;
        for(int i=1; i<=y;i++) {
        	bolum=x/2;
        }
        System.out.println("Bolum="+bolum);
    }
}



