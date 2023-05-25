public class App {
    public static void main(String[] args) throws Exception {
        Box box = new Box();
        Semaforo s = new Semaforo(1);

        Autodromo a1 = new Autodromo("Perez", "Ferrari", 3, box, s);
        Autodromo a2 = new Autodromo("Bottas", "Mercedes", 9, box, s);
        Autodromo a3 = new Autodromo("Hamiltom", "Mercedes", 7, box, s);

        a1.start();
        a2.start();
        a3.start();

        a1.join();
        a2.join();
        a3.join();

        System.out.println("Gara FInita");
    }
}
