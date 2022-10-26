package busca.nome;

import busca.TarefaBuscaTexto;

public class Main {

    public static void main(String[] args) {
        String nome = "Jon";

        Thread threadBuscaAssinatura1 = new Thread(new TarefaBuscaTexto("assinaturas1.txt", nome));
        Thread threadBuscaAssinatura2 = new Thread(new TarefaBuscaTexto("assinaturas2.txt", nome));
        Thread threadBuscaAutores = new Thread(new TarefaBuscaTexto("autores.txt", nome));

        threadBuscaAssinatura1.start();
        threadBuscaAssinatura2.start();
        threadBuscaAutores.start();
    }

}
