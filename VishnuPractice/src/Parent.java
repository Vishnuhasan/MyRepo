
class Parent {
    int id;
    public void display(){
        System.out.println("Parent method");
    }
    public void print(){
        display();
    }
}
class Child extends Parent{
    Child(){
        this.id=1;
        super.id=2;
        display();
    }
     public void display(){
        System.out.println("child method - "+id);
    }
    public void display(int x){
        System.out.println("child method - "+id);
    }
}

class Runner  {
    public static void main(String[] args) {
        System.out.println(Runner.class);
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }
}
