package com.lista;

import java.util.List;

public class TarefaAdicionarElemento implements Runnable {

    private final int numeroDoThread;
    private List<String> lista;

    public TarefaAdicionarElemento(List<String> lista, int i) {
        this.lista = lista;
        this.numeroDoThread = i;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            this.lista.add("Thread " + numeroDoThread + " - " + i);
        }
    }
}
