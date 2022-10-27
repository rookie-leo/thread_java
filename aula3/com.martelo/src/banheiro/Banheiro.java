package banheiro;

public class Banheiro {

    private boolean estahSujo = true;

    public void fazNumero1() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta");

        synchronized (this) {
            System.out.println(nome + " entrando no banheiro");

            while (estahSujo) {
                esperaLaFora(nome);
            }

            if (this.estahSujo) {
                esperaLaFora(nome);
            }

            System.out.println(nome + " fazendo coisa rapida");
            esperaUmPouco(8000);

            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mao");
            System.out.println(nome + " saindo do banheiro");
            estahSujo = true;
        }
    }

    public void fazNumero2() {

        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta");

        synchronized (this) {
            System.out.println(nome + " entrando no banheiro");

            while (estahSujo) {
                esperaLaFora(nome);
            }

            if (this.estahSujo) {
                esperaLaFora(nome);
            }

            System.out.println(nome + " fazendo coisa demorada");

            esperaUmPouco(15000);

            System.out.println(nome + " dando descarga");
            System.out.println(nome + " lavando a mao");
            System.out.println(nome + " saindo do banheiro");
            estahSujo = true;
        }
    }

    private static void esperaUmPouco(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void esperaLaFora(String nome) {
        System.out.println(nome + " eca, o banheiro está sujo");

        try {
            this.wait();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public void limpaBanheiro() {
        String nome = Thread.currentThread().getName();

        System.out.println(nome + " batendo na porta");

        synchronized (this) {
            System.out.println(nome + " entrando no banheiro");

            if (!estahSujo) {
                System.out.println(nome + " o banheiro está limpo");
                System.out.println(nome + " saindo do banheiro");
                return;
            }

            System.out.println(nome + " limpando o banheiro");

            estahSujo = false;

            esperaUmPouco(20000);

            System.out.println(nome + " saindo do banheiro");
            notifyAll();
        }
    }

}
