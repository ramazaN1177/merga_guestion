package soru;
 

import java.util.Scanner;  

public class Soru_11 {  

 public static void main(String[] args) {  

     System.out.print("4 Basamakli Sayi giriniz : ");   
     Scanner scan = new Scanner(System.in);  
      

     int sayi = scan.nextInt();  
    
    

    
    	int a= sayi%100;
    	int b = sayi/100;  
    	int c = a+b;
    	System.out.println(a+"\n"+b);
    	if(c*c==sayi) {
    		
        System.out.println("Sayi orjinaldir!");

     } 
    
 }  
}
