package org.example;

import java.util.Scanner;

public class OrderingSystem {
    private static OrderingSystem instance;

    private OrderingSystem(){

    }

    public static synchronized OrderingSystem getInstance(){
        if(instance==null){
            instance = new OrderingSystem();
        }
        return instance;
    }

    public void placeOrder(){
        int n;
        System.out.println("Enter number of items you want to buy: ");
        Scanner sc = new Scanner(System.in);
        n= sc.nextInt();
        System.out.println("Your order for "+n+" items is placed");
    }

}

