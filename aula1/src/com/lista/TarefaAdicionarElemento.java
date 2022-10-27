package com.lista;

public class TarefaAdicionarElemento implements Runnable {

    private final int numeroDoThread;
    private Lista lista;

    public TarefaAdicionarElemento(Lista lista, int i) {
        this.lista = lista;
        this.numeroDoThread = i;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.lista.adicionaElementos("Thread " + numeroDoThread + " - " + i);
        }
    }
}
