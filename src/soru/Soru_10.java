package soru;
import java.util.Scanner;
public class Soru_10 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int planeSpeed=0;
		System.out.println("Dakika giriniz:");
		int n=scan.nextInt();
		int i =1;
		int x= 35;
		int Speed=480;
		if(n<=15) {
		while(i<=n) {
			planeSpeed+=32;
			i++;
			
		}
	System.out.println("Ucagin hizi : "+planeSpeed);
	}
		else if(15<n&&n<=35) {
			System.out.println("Ucagin hizi : 480");
		}
		else if(35<n&&n<50)	{
			while(x<=n) {
				Speed-=32;
				x++;
				
			}
			System.out.println("Ucagin hizi : "+Speed);
		}
		else {
			System.out.println("Gecerli Sayi Giriniz!");
			
		}
	}
}
