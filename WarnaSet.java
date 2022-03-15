package pbo.tugas.collection;

import java.util.*;

public class WarnaSet {

    public static void main(String[] args) {
        // deklarasi collection Set menggunakan implementasi class menggunakan LinHashSet
        Set<String> WarnaPelangi = new LinkedHashSet<>();
        WarnaPelangi.add("Merah"); // method add() untuk menambahkan objek ke Set
        WarnaPelangi.add("Merah");
        WarnaPelangi.add("Merah"); // Disini Saya mencoba menambahkan Objek "Merah" beberapa kali
        WarnaPelangi.add("Jingga");
        WarnaPelangi.add("Kuning");
        WarnaPelangi.add("Hijau");
        WarnaPelangi.add("Biru");
        WarnaPelangi.add("Nila");
        WarnaPelangi.add("Ungu");

        System.out.println("Warna Pelangi Awal");
        System.out.println(WarnaPelangi);

        WarnaPelangi.remove("Jingga"); // method remove() untuk mengeluarkan objek dari Set

        System.out.println();
        System.out.println("Warna Pelangi Akhir(Setelah Remove)");
        System.out.println(WarnaPelangi);
    }

}
