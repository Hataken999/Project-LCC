import java.time.LocalDate;
import java.time.Period;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		
		String nama = JOptionPane.showInputDialog("Input Nama");
		String tglLahir = JOptionPane.showInputDialog("Tanggal Lahir");
		String blnLahir = JOptionPane.showInputDialog("Bulan Lahir (angka)");
		String thnLahir = JOptionPane.showInputDialog("Tahun Lahir");
		
		int tgl = Integer.parseInt(tglLahir);
		int bln = Integer.parseInt(blnLahir);
		int thn = Integer.parseInt(thnLahir);
		
		LocalDate today = LocalDate.now();
		LocalDate ulangTahun = LocalDate.of(thn, bln, tgl);
		
		Period p = Period.between(ulangTahun, today);
		
		JOptionPane.showMessageDialog(null, 
		"Nama : " + nama +
		"\nUmur : " + p.getYears()
		);
	}
}
