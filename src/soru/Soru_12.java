package soru;

import java.util.Scanner;  

public class Soru_12 {  

 public static void main(String[] args) {  

     System.out.print("4 Basamakli Sayi giriniz : ");   
     Scanner scan = new Scanner(System.in);  
      

     int sayi = scan.nextInt();  
    
    

    
    	int a= sayi%10;
    	int b = (sayi%100)/10;  
    	int c = (sayi%1000)/100;
    	int d = sayi/1000;
    	System.out.println(a+"\n"+b+"\n"+c+"\n"+d);}

}
