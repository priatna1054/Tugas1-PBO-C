package pbo.tugas.collection;

import java.util.*;

public class AbsensiMap {

    public static void main(String[] args) {
        // menggunakan HashMap
        Map<String,String> Absensi = new TreeMap();
        Absensi.put("1001","Rahma Wati"); // method put() untuk menambahkan objek ke Map
        Absensi.put("1005","Andrea Nua KW1");
        Absensi.put("1003","Deva Danu");
        Absensi.put("1004","Risa Yani");
        Absensi.put("1002","Diva Putra");
        Absensi.put("1005","Andrea Nua");
        Absensi.put("1005","Andrea Nua KW2");// Saya mencoba menambahkan key yang sama kecollection Map

        System.out.println("Absensi Awal");
        System.out.println(Absensi);

        Absensi.remove("1005"); // method remove(key) untuk mengeluarkan objek dari Map

        System.out.println();
        System.out.println("Absensi Akhir(Setelah Remove)");
        System.out.println(Absensi);
    }

}
