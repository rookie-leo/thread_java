package busca;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class TarefaBuscaTexto implements Runnable {

    private String nomeArquivo;
    private String nome;

    public TarefaBuscaTexto(String nomeArquivo, String nome) {
        this.nomeArquivo = nomeArquivo;
        this.nome = nome;
    }

    @Override
    public void run() {
        try {
            Scanner scanner = new Scanner(new File(nomeArquivo));
            int numero = 1;

            while (scanner.hasNext()) {
                String linha = scanner.nextLine();
                if (linha.contains(nome)) System.out.println(nomeArquivo + " - " + numero + " - " + linha);
                numero++;
            }

            scanner.close();
        } catch (FileNotFoundException | NullPointerException e) {
            throw new RuntimeException(e);
        }
    }
}
