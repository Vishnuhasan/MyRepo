package JBDL;

public class LoopUsingThread implements Runnable{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("new thread: "+i);

        }
    }
}
