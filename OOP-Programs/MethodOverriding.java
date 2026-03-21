//java program to understand method overriding

import java.util.Scanner;

class Employee{
    double calculateSalary() {
        return 0;
    }
}

class FullTimeEmployee extends Employee{
    double salary = 50000;
    
    @Override
    double calculateSalary() {
        return salary;
    }
}

class PartTimeEmployee extends Employee{
    double hours = 5;
    double rate = 500;
    
    @Override
    double calculateSalary() {
        return hours * rate;
    }
}


public class MethodOverriding {
    public static void main(String args[]){
        Employee e1 = new FullTimeEmployee();
        Employee e2 = new PartTimeEmployee();
        
        System.out.println("Full-time salary: " + e1.calculateSalary());
        System.out.println("Part-time salary: " + e2.calculateSalary());
    }
}
