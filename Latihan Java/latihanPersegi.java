import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("DC : ");
		int DC = in.nextInt();
		
		System.out.print("DA : ");
		int DA = in.nextInt();
		
		System.out.print("DG : ");
		int DG = in.nextInt();
		
		System.out.print("BE : ");
		int BE = in.nextInt();
		
		int luasP1 = DC * DA;
		int GA = DA - DG;
		int GF = BE + DC;
		int luasP2 = GF * GA;
		
		// Luas Gabungan
		int luasGabungan = luasP1 + luasP2;
		
		System.out.println(
		"\nLuas Persegi 1 = " + luasP1 +
		"\nLuas Persegi 2 = " + luasP2 +
		"\nLuas Gabungan = " + luasGabungan
		);
		
	}
}