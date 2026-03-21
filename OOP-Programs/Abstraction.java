//java program to understand abstraction

import java.util.Scanner;

abstract class Animal{
    abstract void sound();
    
    void eat() {
        System.out.println("Eating..");
    }
}

class Dog extends Animal{
    void sound() {
        System.out.println("Barking..");
    }
}

class Abstraction {
    public static void main(String args[]){
        Dog d = new Dog();
        d.sound();
        d.eat();
    }
}
