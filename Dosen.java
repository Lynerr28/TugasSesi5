
package tugas.Sesi5;
import java.util.ArrayList;
/**
 *
 * @author feby_alfaraby_20210040133
 */
public class Dosen extends Person{
    private int jumlahmatkul;
    private ArrayList<String> matkulList;
    
    public Dosen(String name, String address){
        super(name, address);
        jumlahmatkul = 0;
        matkulList = new ArrayList<>();
    }
    
    public boolean addCourse(String course){
        //jika dalam ArrayList ada yang sama maka
        if(!matkulList.contains(course)){
            System.out.println("Matkul telah ada");
            return false;
        }
        
        //menambahkan
        jumlahmatkul++;
        matkulList.add(course);
        return true;
    }
    
    public boolean removeCourse(String course){
        // jika dalam ArrayList tidak ada course maka
        if(!matkulList.contains(course)){
            System.out.println("Matkul yang akan di hapus tidak ada");
            return false;
        }
        
        // jika ada maka
        jumlahmatkul--;
        matkulList.remove(course);
        return true;
    }
    
    public int getjumlahmatkul(){
        return jumlahmatkul;
    }
    
    public String toString(){
        return
                super.toString()+
                "\n Jumlah Mata kuliah yang diampu : "+ getjumlahmatkul();
    }
}
