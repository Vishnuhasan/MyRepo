package JBDL.InterThreatCom;

public class Chat {
    boolean flag = false;
    public synchronized void question(String msg){
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("Question: "+msg);
        flag = true;
        notify();
    }
    public synchronized void answer(String msg){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        System.out.println("answer: "+msg);
        flag = false;
        notify();
    }
}
