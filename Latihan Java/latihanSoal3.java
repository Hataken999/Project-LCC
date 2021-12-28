import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Permukaan Kubus : ");
		int pk = in.nextInt();
		
		System.out.print("Tinggi Tabung : ");
		int tt = in.nextInt();
		
		System.out.print("Jari² : ");
		int r = in.nextInt();
		
		final double phi = Math.PI;
		DecimalFormat df = new DecimalFormat("#.##");
		
		// Rumus Kubus
		int m = (int) Math.sqrt(pk / 6);
		int luasPK = (int) Math.pow(m, 2) * 6;
		int vKubus = (int) Math.pow(m, 3);
		
		// Rumus Tabung
		double kl = 2 * phi * r;
		float luasPT = (float) kl * (r + tt);
		float  luasST = (float) kl * tt;
		
		// Desimal format
		String LPTF = df.format(luasPT);
		String LSTF = df.format(luasST);
		
		System.out.println(
		"\nPanjang Rusuk Kubus = " + m + " cm" +
		"\nLuas Permukaan Kubus = " + luasPK + " cm" +
		"\nVolume Kubus = " + vKubus + " cm" +
		"\nLuas Permukaan Tabung = " + LPTF + " cm" +
		"\nLuas Selimut  Tabung = " + LSTF + " cm"
		);
	}
}