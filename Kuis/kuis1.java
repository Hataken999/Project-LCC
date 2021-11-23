import java.util.Scanner;

public class kuis1 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		// Kode ansi untuk warna text
		final String ANSI_RESET = "\u001B[0m";
		final String ANSI_GREEN = "\u001B[32m";
		final String ANSI_CYAN = "\u001B[36m";
		final String ANSI_RED = "\u001B[31m";
		
		System.out.print("Nama Pegawai : ");
		String nama = in.nextLine();
		
		System.out.print("Jam Masuk : ");
		int masuk = in.nextInt();
		
		System.out.print("Jam Keluar : ");
		int keluar = in.nextInt();
		
		int lama = 0;
		//kondisi
		if (masuk < keluar && keluar < 24 && masuk != keluar) {
		  // Format 24 jam
		  lama += keluar - masuk;
		} else if (masuk > keluar && masuk <= 12 && masuk != keluar) {
		  // Format 12 jam
		  lama += (keluar + 12) - masuk;
		} else {
		  // error output
		  System.out.println(ANSI_RED + "\n\n\nError" + ANSI_RESET + ": Nilai input melebihi format waktu");
		  System.exit(0);
		}
		
		System.out.printf("\n\nNama %s%s%s\nLama Bekerja %s%d jam%s", ANSI_GREEN, nama, ANSI_RESET, ANSI_CYAN, lama, ANSI_RESET);
	}
}
