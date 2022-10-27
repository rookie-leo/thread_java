package martelo;

public class Martelo {

    public void martela() {
        String nome = Thread.currentThread().getName();

        System.out.println(nome + " pedindo o martelo emprestado");

        synchronized (this) { // martelo.Martelo está ocupado
            System.out.println(nome + " pegou o martelo");
            System.out.println(nome + " está martelando");

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(nome + " terminou de martelar");
        } // martelo.Martelo desocupado

    }

    public void desprega() {
        String nome = Thread.currentThread().getName();

        System.out.println(nome + " pedindo o martelo emprestado");

        synchronized (this) { // martelo.Martelo está ocupado
            System.out.println(nome + " pegou o martelo");
            System.out.println(nome + " está despregando um prego");

            try {
                Thread.sleep(20000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(nome + " terminou de despregar");
        } // martelo.Martelo desocupado
    }

}
