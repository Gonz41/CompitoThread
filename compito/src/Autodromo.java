public class Autodromo extends Thread {
    private String scuderia;
    private String pilota;
    private int numero;
    private Box box;
    private Semaforo semaforo;

    public Autodromo(String name, String s, int n, Box b, Semaforo sem){
        super(name);
        this.scuderia = s;
        this.pilota = name;
        this.numero = n;
        this.box = b;
        this.semaforo = sem;
    }
    

    public void run(){
        int vettura = (int) (Math.random()*4+1);
        int cambioGomme = (int) (Math.random()*5+1);
        for(int i=1;i<11;i++){
            try {
                Thread.sleep(vettura);
            }catch(InterruptedException e){
                e.printStackTrace();
            }
            
            if(i == 3 || i == 6 || i == 9){
                semaforo.P();
                box.entra();
                try{
                    Thread.sleep(cambioGomme);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                box.fine();
                semaforo.V();
            }
            System.out.println("GIRO "+i+ " Completato "+ pilota);
        }        
    }
}
