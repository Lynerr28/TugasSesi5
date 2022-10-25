
package tugas.Sesi5;

/**
 *
 * @author feby_alfaraby_20210040133
 */
public class Person {
    private String name;
    private String address;
    
    public Person(String name, String address){
        this.name = name;
        this.address = address;
    }
    
    public String getName(){
        return this.name;
    }
    
    public String getAddress(){
        return this.address;
    }
    
    public void setName(String addres){
        this.address = address;
    }
    
    @Override
    public String toString(){
        return
                "nama: "+ getName() +
                "\nAlamat: "+ getAddress();
    }
}
