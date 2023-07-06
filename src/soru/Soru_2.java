package soru;
import java.util.Scanner;
import java.util.Arrays;
public class Soru_2 {

	public static void main(String[] args) {
		Scanner Obj = new Scanner(System.in);
		System.out.println("Sayilari Giriniz");
		float toplam=0;
		while(true) {
			int sayilar= Obj.nextInt();
			int[] myNum= {};
			
			if(sayilar==0) {
				
				System.out.println(Arrays.toString(myNum));
				for(int sayi : myNum) {
					toplam=toplam+sayi;
				}
				System.out.println("Sayilarin Ortalamasi :" +(toplam/myNum.length));
				break;
			}
		}
		
	}

}
