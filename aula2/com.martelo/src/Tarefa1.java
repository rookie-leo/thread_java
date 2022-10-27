public class Tarefa1 implements Runnable{

    private Martelo martelo;

    public Tarefa1(Martelo martelo) {
        this.martelo = martelo;
    }

    @Override
    public void run() {
        this.martelo.martela();
    }
}
