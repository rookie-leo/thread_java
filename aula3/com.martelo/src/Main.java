public class Main {

    public static void main(String[] args) {
        Martelo martelo = new Martelo();

        Thread usuario1 = new Thread(new Tarefa1(martelo), "Reinhardt");
        Thread usuario2 = new Thread(new Tarefa2(martelo), "Fernando");
        Thread usuario3 = new Thread(new Tarefa2(martelo), "Mercy");
        Thread usuario4 = new Thread(new Tarefa1(martelo), "Kinessa");

        usuario1.start();
        usuario2.start();
        usuario3.start();
        usuario4.start();
    }

}
