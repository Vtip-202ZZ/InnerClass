/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zha;

/**
 *
 * @author student
 */
public class Person extends Human3 {

   
     public Person() {
    }

     public Person(String name, int age, boolean Man, String activity, int favouritenumber) {
       super(name, age, Man, activity, favouritenumber);

   

        }

    Person(String zhanibek, int i, boolean b, int i0) {
       
    }
    

     @Override
    public String getJob() {
        return "Worker";
    }
     
     
    @Override
    public void sayYourJob() {

    }

    String sayYourJob(String student) {
        return "Student";
    }
     
     
     
     
     
     
}
