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

    }
}
