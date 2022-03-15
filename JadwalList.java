package pbo.tugas.collection;

import java.util.*;

public class JadwalList {

    public static void main(String[] args) {

        // deklarasi collection list menggunakan implementasi class ArrayList
        List<String> Jadwal = new ArrayList<>();
        Jadwal.add("Senin,  [Tecno]"); // collection list menggunakan method add() untuk menambahkan objek
        Jadwal.add("Selasa, [ASTI & SIM]");
        Jadwal.add("Rabu,   [Jarkom]");
        Jadwal.add("Kamis,  [PBO & TBD]");
        Jadwal.add("Jumat,  [PKN]");
        Jadwal.add("Senin,  [Tecno]");
        //saya menambahkan objek yang sama untuk mebuktikan List dapat menampilkan objek yang sama

        System.out.println("Jadwal Awal");
        System.out.println(Jadwal);

        Jadwal.remove("Jumat, [PKN]"); // method remove() untuk mengeluarkan objek dari List

        System.out.println();
        System.out.println("Jadwal Akhir (Sesudah Remove)");
        System.out.println(Jadwal);

    }

}
