package JBDL.InterThreatCom;

public class T1 implements Runnable{
    Chat chat;
    String [] msgs={"Hi, How are you?","I am also fine"};
    public T1(Chat chat){
        this.chat=chat;
        new Thread(this).start();
    }

    @Override
    public void run() {
        for(int i =0;i<msgs.length;i++){

        }
    }
}
