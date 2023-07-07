package soru;
import java.util.Scanner;
public class Soru_4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("1. Carpan sayi:");
		int A=scan.nextInt();
		System.out.println("2. Carpan sayi:");
		int B=scan.nextInt();
		int i=1;
		int sonuc=0;
		while(i<=B) {
			sonuc=sonuc+A;
			i++;
		}
System.out.println("Sonuc = "+ sonuc);
	}

}
