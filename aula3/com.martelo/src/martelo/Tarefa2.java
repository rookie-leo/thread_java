package martelo;

public class Tarefa2 implements Runnable{

    private Martelo martelo;

    public Tarefa2(Martelo martelo) {
        this.martelo = martelo;
    }

    @Override
    public void run() {
        this.martelo.desprega();
    }
}
