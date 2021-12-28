import java.util.Scanner;

public class pertambahanBerurut {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Angka pertambahan akhir : ");
		int angka = in.nextInt();
		
		double hasil = 0;
		for (int i = 1; i <= angka; i++) {
			hasil += i;
		};
		
		System.out.printf("\nPertambahan 1 + 2 + ... + %d adalah %,3.0f", angka, hasil);
	}
}