package soru;
import java.util.Scanner;
public class soru {

	public static void main(String[] args) {
		
		Scanner Obj = new Scanner(System.in);
		System.out.println("Bir Sayi Giriniz");
		int sayi= Obj.nextInt();
		if((sayi%2)==0) {
			System.out.println(sayi+"->"+"Sayiniz Cift Sayi");
		}
		else {
			System.out.println(sayi+"->"+"Sayiniz Tek Sayi");
		}
		

	}
}
