//java program to understand interface in oops

import java.util.Scanner;

interface Payment{
    void pay(int amount);
}

class CreditCard implements Payment{
    public void pay(int amount){
        System.out.println("Paid " + amount + " using credit card");
    }
}

class UPI implements Payment{
    public void pay(int amount){
        System.out.println("Paid" + amount + "using UPI");
    }
}


public class Interface {
    public static void main(String args[]){
        Payment p1 = new CreditCard();
        Payment p2 = new UPI();
        
        p1.pay(1000);
        p2.pay(500);
    }
}
