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
public class Human2 {
    private String name;
    private int age;
    private boolean Man;
    private String activity;
    private int favouritenumber;

    public Human2() {
        this.age = 0;
        this.name = "???";
        this.Man = true;
        this.activity = "???";
        this.favouritenumber = 0;
    }

    Human2(String dennis, int i, boolean b, String boss) {
       
    }

    public int getFavouritenumber() {
        return favouritenumber;
    }

    public void setFavouritenumber(int favouritenumber) {
        this.favouritenumber = favouritenumber;
    }

    public Human2(String name, int age, boolean Man, String activity, int favouritenumber) {
        this.name = name;
        this.age = age;
        this.Man = Man;
        this.activity = activity;
        this.favouritenumber = favouritenumber;
    }

    

    @Override
    public String toString() {
        return "Human{" + "name=" + name + ", age=" + age + ", Man=" + Man + ", activity=" + activity + "favouritenumber=" + favouritenumber + '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean Man() {
        return Man;
    }

    public void setMan(boolean Man) {
        this.Man = Man;
    }

    public String getActivity() {
        return activity;
    }

    public void setActivity(String activity) {
        this.activity = activity;
    }

    String HUMAN(String boss) {
        return "Boss";
       
    }

    
}
