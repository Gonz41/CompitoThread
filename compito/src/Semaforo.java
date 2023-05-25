public class Semaforo {
    private int valore;

    public Semaforo(int v){
        this.valore = v;
    }

    public synchronized void P(){
        System.out.println("------------"+ Thread.currentThread().getName()+ " in attesa al box ---------------");
        while(valore == 0){
            try{
                wait();
            }catch(InterruptedException e){
                System.out.println(e.getMessage());
            }
            
        }
        valore --;
    }

    public synchronized void V(){
        valore++;
        notify();
    }
}
