package soru;

import java.util.Scanner;

public class Soru_5 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Kenar uzunluklarini giriniz!");
		int A=scan.nextInt();
		int B=scan.nextInt();
		int C=scan.nextInt();
		int D=scan.nextInt();
		
		if(A==B&&A==C&&A==D&&B==C&&B==D&&C==D) {
			System.out.println("Kenar uzunlugu"+" "+ A+" " + "olan bir kare");
			
		}
		else {
			System.out.println("Kare değil!!");
		}
		
		
	}

}
