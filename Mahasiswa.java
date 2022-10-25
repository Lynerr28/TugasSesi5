
package tugas.Sesi5;

import java.util.ArrayList;

public class Mahasiswa extends Person{
    private int jumlahmatkul;
    private ArrayList<String> matakuliah;
    private ArrayList<Integer> nilaiList;
    
    public Mahasiswa(String name, String address){
        super(name, address);
        matakuliah = new ArrayList<>();
        nilaiList = new ArrayList<>();
    }
    
    public void addmatakuliahGrade(String matakuliah, int grade){
        this.matakuliah.add(matakuliah);
        this.nilaiList.add(grade);
        jumlahmatkul++;
    }
    
    public void printnilaiList(){
        for(int i = 0; i < jumlahmatkul; i++){
            System.out.println("Matakuliah: " + matakuliah.get(i)+ "Grade: "+ nilaiList.get(i));
        }
    }
    
    public double getAverageGrade(){
        int jumlah = 0;
        for(int i = 0; i < jumlahmatkul; i++){
            jumlah += nilaiList.get(i);
        }
        
        return jumlah / jumlahmatkul;
    }
    
    public String toString(){
        return
        super.toString()+
                "Jumlah matkul yang diambil : "+ this.jumlahmatkul +
                "\n Rata - rata nilai : "+ getAverageGrade();
    }
}
