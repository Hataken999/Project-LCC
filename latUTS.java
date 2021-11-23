import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
final String ANSI_RESET = "\u001B[0m";
final String ANSI_BLACK = "\u001B[30m";
final String ANSI_RED = "\u001B[31m";
final String ANSI_GREEN = "\u001B[32m";
final String ANSI_YELLOW = "\u001B[33m";
final String ANSI_BLUE = "\u001B[34m";
final String ANSI_PURPLE = "\u001B[35m";
final String ANSI_CYAN = "\u001B[36m";
		
		System.out.println(ANSI_GREEN + "===============MENU===============");
		System.out.println("| 1. Persegi                     |\n| 2. Persegi Panjang             |\n| 3. Segitiga                    |\n| 4. Lingkaran                   |\n| 5. Tabung                      |");
		System.out.println("==================================" + ANSI_RESET);		System.out.print(ANSI_CYAN + "Pilih menu (namanya) = " + ANSI_RESET);
		String menu = in.nextLine();
		
		String pilihan = "";
		
		if (menu.equalsIgnoreCase("1") || menu.equalsIgnoreCase("Persegi")) {
			System.out.println("\n\n==========\u001B[45mPILIHAN METODE\u001B[0m==========");
			System.out.printf("| • Luas %s                 |\n| • Keliling %s             |\n", menu, menu);
			System.out.println("==================================");
			System.out.print("Pilihan (Luas/Keliling) = ");
			pilihan = in.nextLine();
			} else if (menu.equals("2") || menu.equalsIgnoreCase("Persegi Panjang")) {
				System.out.println("\n\n==========PILIHAN METODE==========");
			System.out.printf("| • Luas %s         |\n| • Keliling %s     |\n", menu, menu);
			System.out.println("==================================");
			System.out.print("Pilihan (Luas/Keliling) = ");
			pilihan = in.nextLine();
			} else if (menu.equals("3") || menu.equalsIgnoreCase("Segitiga")) {
				System.out.println("\n\n==========PILIHAN METODE==========");
			System.out.printf("| • Luas %s                |\n| • Keliling %s            |\n", menu, menu);
			System.out.println("==================================");
			System.out.print("Pilihan (Luas/Keliling) = ");
			pilihan = in.nextLine();
			} else {
				System.out.print("\n\n\u001B[31mMenu belum dibuat atau argumen salah! \u001B[0m");
				System.exit(0);
			}
			
			int hasil = 0;
			
			if (menu.equalsIgnoreCase("persegi") && pilihan.equalsIgnoreCase("luas")) {
				System.out.print("Masukkan Sisi Persegi : ");
				int sisi = in.nextInt();
				
				int s = sisi * sisi;
				hasil = s;
			} else if (menu.equalsIgnoreCase("persegi") && pilihan.equalsIgnoreCase("keliling")) {
				System.out.print("Masukkan keliling persegi : ");
				int sisi = in.nextInt();
				int k = sisi * 4;
				hasil = k;
			} else {
				System.out.print("\n\n\u001B[31mMenu belum dibuat atau argumen salah! \u001B[0m");
				System.exit(0);
			}
		
		// Phytagoras
		/*System.out.print("Alas Segitiga : ");
		int a = in.nextInt();
		
		System.out.print("Tinggi Segitiga : ");
		int t = in.nextInt();
		
		int sisiMiring = (int) Math.sqrt(Math.pow(a, 2) + Math.pow(t,2));*/
		System.out.println(
		"\n\n\u001B[42mMenu : " + menu + "\nMetode : " + pilihan + "\nHasil = " + hasil + ANSI_RESET
		);
	}
}