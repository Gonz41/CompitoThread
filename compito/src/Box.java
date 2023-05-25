public class Box {
    public void entra(){
        System.out.println("PIT-STOP "+Thread.currentThread().getName()+" cambio gomme in corso");
    }

    public void fine(){
        System.out.println("PIT-STOP "+Thread.currentThread().getName()+" FINITO");
    }
}
