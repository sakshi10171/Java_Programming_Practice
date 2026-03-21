//java program to understand encapsulation

import java.util.Scanner;

class Student{
    private int id;
    private String name;
    
    void setData(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

class Encapsulation {
    public static void main(String[] args) {
        Student s = new Student();
        s.setData(1, "Sakshi");
        s.display();
    }
}
