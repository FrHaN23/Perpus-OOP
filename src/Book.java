import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Book {
    List<Book> list = new ArrayList<Book>();
    Scanner add = new Scanner(System.in);
    String nama,publisher,pengarang,Kategori;
    int tahunTerbit,stok;
    public Book (String nama, String pengarang, int tahunTerbit, String kategori, int stok ){
        this.nama = nama;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.Kategori= kategori;
        this.stok = stok;
    }

    public Book(){
        list = new ArrayList<Book>();
        Book buku1 = new Book("C++ for dummies", "Ujang", 1998, "SU", 500);
        Book buku2 = new Book("Cara Menjual Nyawa", "Markona", 2001, "D", 20);
        Book buku3 = new Book("Wibu Nasionalis", "Inem", 2016, "SU", 40);
        Book buku4 = new Book("Cara Masak Air", "Kuyang", 1980, "SU", 50);
        Book buku5 = new Book("Bongkar Pasang Hati", "Suep", 2006, "SU", 500);
        Book buku6 = new Book("Kucing Yang Tertukar", "Juminten", 2008, "D", 500);
        Book buku7 = new Book("Nama Nama Hewan", "Bambang", 2018, "A", 500);
        Book buku8 = new Book("Kenapa Kamu Begitu", "Ujang", 2019, "D", 500);
        Book buku9 = new Book("Pyhton is Suck", "Ujang", 2020, "SU", 500);
        Book buku10 = new Book("HolyC is Best", "Ujang", 2021, "SU", 500);
        
        list.add(buku1);
        list.add(buku2);
        list.add(buku3);
        list.add(buku4);
        list.add(buku5);
        list.add(buku6);
        list.add(buku7);
        list.add(buku8);
        list.add(buku9);
        list.add(buku10);
    }

    public List<Book> getList() {
        return list;
    }

    public void Tampilkan(){
        System.out.println("Nama"+ "\t\t\t|" + "Pengarangan" + "\t|" + "Tahun Terbit" + "\t|" + "Kategori" + "\t|" + "Stok" + "\t" );
        for(Book buku:list){
            System.out.println(buku.nama+ "\t\t" + buku.pengarang + "\t" + buku.tahunTerbit + "\t" + buku.Kategori + "\t" +buku.stok + "\t");
        }
    System.out.println("");
    }

    public void MasukkanBuku(){
        List<Book> listToAdd = new ArrayList<Book>();

        System.out.println("Masukkan Nama buku: ");
        String namaBuku = add.nextLine();

        System.out.println("Masukkan Pengarang buku: ");
        String pengarangBuku = add.nextLine();
    
        System.out.println("Masuukkan Tahun Terbit: ");
        int tahunTerbitBuku = Integer.parseInt(add.nextLine());

        System.out.println("Masuukkan Kategori: ");
        System.out.println("SU = Semua Umur, D = Dewasa, R = Remaja, A = Anak-anak");
        String kategoriBuku = add.nextLine();
    
        System.out.println("Masuukkan Stok saat ini: ");
        int stok = Integer.parseInt(add.nextLine());
    
        Book newBuku = new Book(namaBuku, pengarangBuku, tahunTerbitBuku, kategoriBuku, stok);
        listToAdd.add(newBuku);
        list.addAll(listToAdd);
        System.out.println("Buku Berhasil ditambah");
        System.out.println("");
    }
    
}
