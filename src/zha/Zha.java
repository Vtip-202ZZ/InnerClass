/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zha;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author student
 */
public class Zha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Human1 albert = new Human1("Albert ", 19, true, "Student", 18);
//        System.out.println(albert);
//        System.out.println("");

        Human1 den = new Human1("den ", 10, true, "Student", 18);

        Human1 olya = new Human1("Olya ", 20, false, "Student", 18);

        Human2 dennis = new Human2("Dennis", 25, true, "Boss", 18);
        System.out.println(dennis);
        System.out.println("Dennis " + dennis.HUMAN("Boss"));
        System.out.println("");

        Human3 olesya = new Human3("Olesya", 31, false, "Worker", 18) {
            @Override
            public String getJob() {
                return "Worker";

            }

            @Override
            public void sayYourJob() {

            }
        };
        System.out.println(olesya);
        System.out.println("Olesya " + olesya.getJob("Worker"));
        System.out.println("");

        Person zhanibek = new Person("Zhanibek", 19, true, "Student", 18);
        System.out.println(zhanibek);
        System.out.println("Zhanibek " + zhanibek.sayYourJob("Student"));
        System.out.println("");

        ArrayList<Human1> person1 = new ArrayList();
        person1.add(albert);
        person1.add(den);
        person1.add(olya);
        for(int i = 0; i < person1.size(); i++){
         System.out.println(person1.get(i));
        }
        Set<Human1> peerson = new HashSet<Human1>();
        peerson.add(albert);
        peerson.add(den);
        peerson.add(olya);
        for (int i = 0; i < peerson.size(); i++) {
           System.out.println(peerson);
        }
        Map<String, Human1> peeerson = new TreeMap<>();
        peeerson.put("albert", albert);
        peeerson.put("den", den);
        peeerson.put("olya", olya);
        peeerson.remove("albert");
        for (int i = 0; i < peeerson.size(); i++) {
            System.out.println(peeerson);
        }
        System.out.println(person1.size());
        System.out.println(peerson.size());
        System.out.println(peeerson.size());
    }

}
