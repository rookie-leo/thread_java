package numeros;
/**
 * Crie um programa com duas threads
 * que imprimem números de 1 até 1000, além da ID da thread.
 * */
public class ImprimeNumerosEmMaisThreads {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new GeradorNumeros());
        Thread thread2 = new Thread(new GeradorNumeros());

        thread1.start();
        thread2.start();
    }
}
