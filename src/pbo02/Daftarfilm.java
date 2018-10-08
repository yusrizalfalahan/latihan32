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
public class Daftarfilm {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("====Daftar Film Sedang Tayang====");
        System.out.println("");
        Film film = new Film();
        film.filmname = "Venom \n";
        film.filmgenre = "Action, Horor, Scifi \n";
        film.filmrating = 8.5;
        film.filmduration = 120;

        film.nowplaying(film.filmname, film.filmgenre, film.filmrating, film.filmduration);

        Film film2 = new Film();
        film2.filmname = "Small Foot \n";
        film2.filmgenre = "Animation \n";
        film2.filmrating = 89.0;
        film2.filmduration = 96;

        film2.nowplaying(film2.filmname, film2.filmgenre, film2.filmrating, film2.filmduration);

        Film film3 = new Film();
        film3.filmname = "Carzy Rich Asian \n";
        film3.filmgenre = "Comedy \n";
        film3.filmrating = 7.8;
        film3.filmduration = 119;

        film3.nowplaying(film3.filmname, film3.filmgenre, film3.filmrating, film3.filmduration);

        Film film4 = new Film();
        film4.filmname = "Asih \n";
        film4.filmgenre = "Horror \n";
        film4.filmrating = 6.0;
        film4.filmduration = 100;

        film4.nowplaying(film4.filmname, film4.filmgenre, film4.filmrating, film4.filmduration);

    }
}
