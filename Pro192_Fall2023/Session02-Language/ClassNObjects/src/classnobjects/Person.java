/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classnobjects;

/**
 *
 * @author DELL
 */
public class Person {
    //characteristics
   
    private String name;
    private String email;
    private int YearOB;
    private String sex;
    private int phone;
    private String addr;
    //methods
    public Person(){
    }
    public Person(String name, String email, int YearOB, String sex, int phone, String addr){
        
        this.name= name;
        this.email= email;
        this.YearOB= YearOB;
        this.sex= sex;
        this.phone= phone;
        this.addr= addr;  
    }   
    public int fixPhone(){
        return phone;
    }
    public String fixAddr(){
        return addr;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person Nana = new Person("Nana","komatsu@yahoo.com", 1996,"female", 012345,"Japan");
        Person Rian = new Person("","", ,"", ,"");
        System.out.println(Nana);
    }
    
}
