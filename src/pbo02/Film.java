/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package daftarfilm;

/**
 *NAMA       : YUSRIZAL FALAHAN
 * KELAS      : IF-2
 * MATAKULIAH : PBO2
 * NIM        : 10117043
 * DESKRIPSI PROGRES : Program ini berisi daftar film
 * @author Acer
 */
public class Film {
    String filmname, filmgenre;
    double  filmrating;
    int filmduration;
    
    public void nowplaying(String parName, String parGenre, double parrating, int parduration){
        System.out.print("Judul Fillm:" + parName);
        System.out.print("Genre Film:" + parGenre);
        System.out.print("Rating Film:" + parrating + "\n");
        System.out.print("Duration Film:" + parduration +"Menit \n");
        System.out.println("");
    }
}
