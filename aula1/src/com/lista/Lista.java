package com.lista;

public class Lista {

    private String[] elementos = new String[1000];
    private int i = 0;

    public synchronized void adicionaElementos(String elemento) {
        this.elementos[this.i] = elemento;
        this.i++;
    }

    public int tamanho() {
        return this.elementos.length;
    }

    public String pegaElemento(int posicao) {
        return this.elementos[posicao];
    }

}
