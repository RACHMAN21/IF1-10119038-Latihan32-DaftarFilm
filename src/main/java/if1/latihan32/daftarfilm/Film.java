package if1.latihan32.daftarfilm;

/**
 *
 * @author
 * NAMA  : Rachman Aldiansyah
 * KELAS : IF-1
 * NIM   : 10119038
 * Dekripsi Program : program ini berisi untuk menampilkan daftar film yang
 *                    sedang tayang
 */

public class Film {
    public String filmName;
    public String filmGenre;
    public double filmRating;
    public int filmDuration;
    
    public static void main(String[] args) {
        System.out.println("===Daftar Film Sedang Tayang===");
        System.out.println();
        // Menampilkan Film 1
        nowPlaying("Venom","Action, Horror, Scifi",8.5,120);
        System.out.println();
        // Menampilkan Film 2
        nowPlaying("Small Foot","Animation",9.0,96);
        System.out.println();
        // Menampilkan Film 3
        nowPlaying("Crazy Rich Asian","Comedy",7.8,119);
        System.out.println();
        // Menampilkan Film 4
        nowPlaying("Asih","Horror",6.0,100);
        System.out.println();
    }
    
    public static void nowPlaying(String filmName,String filmGenre,double filmRating,int filmDuration) {
        System.out.println("Judul Film    : " + filmName);
        System.out.println("Genre Film    : " + filmGenre);
        System.out.println("Rating Film   : " + filmRating);
        System.out.println("Duration Film : " + filmDuration + " Menit");
    }
}