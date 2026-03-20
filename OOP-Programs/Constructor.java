//Java program to understand constructor in oops

import java.util.Scanner;

class Student{

  int id;
  String name;

  Student(int id, String name){
    this.id = id;
    this.name = name;
  }

  void display() {
    System.out.println("Id: " + id);
    System.out.println("Name: " + name);
  }
}

public class Constructor{

  public static void main(String args[]){

    Student s1 = new Student(1, "Sakshi");
    s1.display();
  }
}
