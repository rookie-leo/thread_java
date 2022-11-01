package com.lista;

public class Lista {

    private String elementos;
    private int i = 0;

    public Lista() {    }

    public Lista(String elementos, int i) {
        this.elementos = elementos;
        this.i = i;
    }

    public synchronized void adicionaElementos(String elemento) {
        this.elementos = elemento;
        this.i++;

        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        if (this.i == this.tamanho()) {
            System.out.println("lista tá cheia, notificando");
            this.notify();
        }
    }

    public String getElemento(int i) {
        return elementos;
    }

    public int tamanho() {
        return i;
    }
}
