
import java.util.Scanner;


public class App {
		public static void main(String[] args) throws Exception {
				// List<Book> list = new ArrayList<Book>();
				// Book buku1 = new Book("C++ for dummies", "Ujang", 1998, "SU", 500);
				// Book buku2 = new Book("Cara Menjual Nyawa", "Markona", 2001, "D", 20);
				// Book buku3 = new Book("Wibu Nasionalis", "Inem", 2016, "SU", 40);
				// Book buku4 = new Book("Cara Masak Air", "Kuyang", 1980, "SU", 50);
				// Book buku5 = new Book("Bongkar Pasang Hati", "Suep", 2006, "SU", 500);
				// Book buku6 = new Book("Kucing Yang Tertukar", "Juminten", 2008, "D", 500);
				// Book buku7 = new Book("Nama Nama Hewan", "Bambang", 2018, "A", 500);
				// Book buku8 = new Book("Kenapa Kamu Begitu", "Ujang", 2019, "D", 500);
				// Book buku9 = new Book("Pyhton is Suck", "Ujang", 2020, "SU", 500);
				// Book buku10 = new Book("HolyC is Best", "Ujang", 2021, "SU", 500);
				// list.add(buku1);
				// list.add(buku2);
				// list.add(buku3);
				// list.add(buku4);
				// list.add(buku5);
				// list.add(buku6);
				// list.add(buku7);
				// list.add(buku8);
				// list.add(buku9);
				// list.add(buku10);
        Book buku = new Book();
        // List<Book> list = buku.getList();
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
									// Scanner add = new Scanner(System.in);
									// List<Book> listToAdd = new ArrayList<Book>();

									// System.out.println("Masukkan Nama buku: ");
									// String namaBuku = add.nextLine();

									// System.out.println("Masukkan Pengarang buku: ");
									// String pengarangBuku = add.nextLine();

									// System.out.println("Masuukkan Tahun Terbit: ");
									// int tahunTerbitBuku = Integer.parseInt(add.nextLine());

									// System.out.println("Masuukkan Kategori: ");
									// System.out.println("SU = Semua Umur, D = Dewasa, R = Remaja, A = Anak-anak");
									// String kategoriBuku = add.nextLine();

									// System.out.println("Masuukkan Stok saat ini: ");
									// int stok = Integer.parseInt(add.nextLine());

									// Book newBuku = new Book(namaBuku, pengarangBuku, tahunTerbitBuku, kategoriBuku, stok);
									// listToAdd.add(newBuku);
									// list.addAll(listToAdd);
                  // System.out.println("Buku Berhasil ditambah");
                  // System.out.println("");
									break;
								case 3:
								isKeluar = true;
                in.close();
						}

				}while(isKeluar!=true);

		}
}
