
package tugas.Sesi5;

import java.util.Scanner;

/**
 *
 * @author fiezb
 */
public class Main {
    public static void main(String[] args) {
        Scanner fb = new Scanner(System.in);
        
        System.out.println("Masukan nama dosen : ");
        String nama = fb.nextLine();
        System.out.println("Masukan alamat dosen : ");
        String alamat = fb.nextLine();
        
        Dosen dosen1 = new Dosen(nama, alamat);
        
        for(int i = 0; i < 3; i++){
            System.out.println("Masukan mata kuliah yang diampu: ");
            String matkul = fb.nextLine();
            dosen1.addCourse(matkul);
        }
        
        System.out.println(dosen1);
    }
}
