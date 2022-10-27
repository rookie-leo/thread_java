package com.lista;

public class Lista {

    private String elementos;
    private int i = 0;

    public synchronized void adicionaElementos(String elemento) {
        this.elementos = elemento;
        this.i++;
    }
}
