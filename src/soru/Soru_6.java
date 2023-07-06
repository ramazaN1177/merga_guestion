package soru;
import java.util.Scanner;

public class Soru_6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Fonksiyonun x degerini giriniz:");
		float x=scan.nextFloat();
		int n=5;
		float sum=0; 
		for(int i =1; i<=n; i++) {
			sum=sum+(i/x*x);
		}
		System.out.println(sum);
	}

}
