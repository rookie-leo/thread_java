package com.threads;

public class Threads1 {

    public static void main(String[] args) {
        System.out.println("Antes da thread dormir");

        try {
            Thread.sleep(15000);

            System.out.println("Depois que a thread acordou!");
        } catch (InterruptedException e) {
            throw new RuntimeException("Houve um erro durante a execução: " + e);
        }
    }

}
