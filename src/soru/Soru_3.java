package soru;
import java.util.Scanner;
public class Soru_3 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Bolunen sayi:");
		int A=scan.nextInt();
		System.out.println("Bolen sayi:");
		int B=scan.nextInt();
		
		int c=A/B;
		
		System.out.println("Kalan =" + (A-(c*B)));
		
	}

}
