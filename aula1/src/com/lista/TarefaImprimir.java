package com.lista;

public class TarefaImprimir implements Runnable {
    private Lista lista;

    public TarefaImprimir(Lista lista) {
        this.lista = lista;
    }

    @Override
    public void run() {

        synchronized (lista) {
            try {
                System.out.println("esperando, aguardando notificacao");
                lista.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            for (int i = 0; i < 10; i++) {
                System.out.println(i + " - " + lista.getElemento(i));
            }
        }
    }
}
