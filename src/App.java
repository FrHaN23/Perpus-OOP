
import java.util.Scanner;


public class App {
		public static void main(String[] args) throws Exception {
        Book buku = new Book();
				Scanner in = new Scanner(System.in);
				boolean isKeluar = false;
				do{
						System.out.println("Perpustakaan Emperan");
						System.out.println("=========================");
						System.out.println("1. Tampilkan semua buku");
						System.out.println("2. Tambah buku");
						System.out.println("3. Keluar");
						System.out.println("=========================");
						System.out.println("Silakan pilih :");
						int pilih = in.nextInt();
						System.out.println("");
						switch (pilih){
								case 1:
                  buku.Tampilkan();
									break;
								case 2:
									buku.MasukkanBuku();
									break;
								case 3:
								isKeluar = true;
                in.close();
						}

				}while(isKeluar!=true);

		}
}
