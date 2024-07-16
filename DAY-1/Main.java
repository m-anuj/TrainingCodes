package org.example;


public class Main {

    public static void main(String[] args) {
        OrderingSystem order1 = OrderingSystem.getInstance();
        OrderingSystem order2 = OrderingSystem.getInstance();

        System.out.println(order1 == order2);
        order1.placeOrder();
    }


}