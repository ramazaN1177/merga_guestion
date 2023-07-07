package soru;
import java.util.Scanner;

public class Soru_6 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("n degerini giriniz:");
		int n=scan.nextInt();
		float x=1;
		float sum=0; 
		for(int i =1; i<=n; i++) {
			sum=sum+(1/(x*x));
			x++;
		}
		System.out.println(sum);
	}

}
