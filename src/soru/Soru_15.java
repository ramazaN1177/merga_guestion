package soru;
import java.util.Scanner;
public class Soru_15 {

	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
		int a;
		System.out.println("Sayi giriniz: ");
		int sayi=scan.nextInt();
		int factoriel=1;
		if(sayi>=5&&sayi<=10) {
			System.out.println("Girdiğiniz sayi :"+ sayi);
			System.out.println("Sonuc : "+ sayi*sayi);
		}
		else if(sayi<5) {
			for(int i =1; i<=sayi; i++) {
				factoriel=factoriel*i;
			}
			System.out.println("Girilen" + " "+sayi +" "+"sayisinin faktoriyeli = "+ factoriel);
		}
		else if(sayi>10) {
			a=(sayi/2)-1;
			System.out.println(a);
		}
	}

}
