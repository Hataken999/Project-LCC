import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;
//import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
	
		System.out.print("Nama : ");
		String nama  = in.nextLine();
		
		System.out.print("Tanggal Lahir : ");
		int tgl  = in.nextInt();
		
		System.out.print("Bulan Lahir (1-12) : ");
		int bln  = in.nextInt();
		
		System.out.print("Tahun Lahir : ");
		int thn  = in.nextInt();
		
	
		// String nama = JOptionPane.showInputDialog("Input Nama");
		// String tglLahir = JOptionPane.showInputDialog("Tanggal Lahir");
		// String blnLahir = JOptionPane.showInputDialog("Bulan Lahir (angka)");
		// String thnLahir = JOptionPane.showInputDialog("Tahun Lahir");
		
		// int tgl = Integer.parseInt(tglLahir);
		// int bln = Integer.parseInt(blnLahir);
		// int thn = Integer.parseInt(thnLahir);
		
		// Untuk mendapatkan date hari ini.
		LocalDate today = LocalDate.now();
		// Untuk menyimpan tanggal lahir
		LocalDate lahir = LocalDate.of(thn, bln, tgl);
		
		Period p = Period.between(lahir, today);
		
		System.out.printf(
		  "\n\nNama : %s\nUmur : %d tahun, %d bulan, %d hari.", nama, p.getYears(), p.getMonths(), p.getDays()
		  );
		  
		  System.out.print("\n\nSekarang : " + today);
		  System.out.print("\nLahir : " + lahir);
		
		// JOptionPane.showMessageDialog(null, 
		// "Nama : " + nama +
		// "\nUmur : " + p.getYears()
		// );
	}
}