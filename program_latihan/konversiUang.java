package program_latihan;

import java.util.Scanner;

public class konversiUang {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("==========MONEY CHANGER==========");
		System.out.print("Masukkan Jumlah Uang \t: ");
		double uangRupiah = in.nextDouble();
		
		System.out.println("1. Yen (¥)\n2. USD ($)\n3. Yuan (¥)");
		System.out.print("Pilih Mata Uang (1/2/3) : ");
		int pilihan = in.nextInt();
 
		// String mataUang = "";
		// char symbol = '';
		// double uangKonversi = 0;
		// double sisa = 0;
		// double kembalian = 0;
		
		System.out.println("\n=============OUTPUT=============");
		
		if (pilihan == 1) {
		  double konversi = uangRupiah / 124;
		  int yen = 0;
		  
		  while (konversi >= 1000) {
		    yen += 1;
		    konversi -= 1000;
		  }
		  
		  double kembalian = konversi * 124;
		  System.out.printf(
		    "Jumlah uang \t\t: Rp %,3.0f\nUang ditukarkan ke USD \t: %d lembar 1000 Yen\nKembalian \t\t: Rp %,3.0f", uangRupiah, yen, kembalian
		    );
		} else if (pilihan == 2) {
		  double konversi = uangRupiah / 15000;
		  int usd100 = 0;
		  int usd50 = 0;
		  int usd10 = 0;
		  
		  while (konversi >= 10) {
		    if (konversi >= 100) {
  		    usd100 += 1;
  		    konversi -= 100;
		    } else if (konversi >= 50) {
		      usd50 += 1;
		      konversi -= 50;
		    } else if (konversi >= 10) {
		      usd10 += 1;
		      konversi -= 10;
		    }
		  }
		  
		  double kembalian = konversi * 15000;
		  System.out.printf(
		    "Jumlah uang \t\t: Rp %,3.0f\nUang ditukarkan ke USD \t: %d lembar 100 USD, %d lembar 50 USD, %d lembar 10 USD\nKembalian \t\t: Rp %,3.0f", uangRupiah, usd100, usd50, usd10, kembalian
		    );
		  
		} else if (pilihan == 3) {
		  double konversi = uangRupiah / 2200;
		  int yuan100 = 0;
		  int yuan10 = 0;
		  
		  while (konversi >= 10) {
		    if (konversi >= 100) {
  		    yuan100 += 1;
  		    konversi -= 100;
		    } else if (konversi >= 10) {
		      yuan10 += 1;
		      konversi -= 10;
		    }
		  }
		  
		  double kembalian = konversi * 2200;
		  System.out.printf(
		    "Jumlah uang \t\t: Rp %,3.0f\nUang ditukarkan ke USD \t: %d lembar 100 Yuan, %d lembar 10 Yuan\nKembalian \t\t: Rp %,3.0f", uangRupiah, yuan100, yuan10, kembalian
		    );
		} else {
			System.out.println("Input pilihan salah!");
			System.exit(0);
		}
		
	}
}
