package JBDL;

public class LoopImp {
    public static void main(String[] args) throws InterruptedException {
        LoopUsingThread obj=new LoopUsingThread();
        Thread t=new Thread(obj);
        t.start();

        for (int i=0;i<10;i++){
            System.out.println("main: "+i);
            t.join();

        }
    }
}
