//Java program to understand class and object in oops

import java.util.Scanner;

class Student{
  int  id;
  String name;

  void display() {
    System.out.println("ID: " + id);
    System.out.println("Name: " + name);
  }
}

public class ClassAndObject{

  public static void main(String args[]){

    Student s1 = new Student();
    s1.id = 1;
    s1.name = "Sakshi";

    s1.display();
  }
}
