package com.threads;

public class Threads2 {

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Rodando uma thread com classe anonima!");
            }
        }).start();
    }

}
