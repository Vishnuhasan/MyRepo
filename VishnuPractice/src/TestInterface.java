interface TestInterface {
    public static final int x=1;
    default void display(){

    }
}
interface TestInterface2 {
    default void display(){
        throw new NullPointerException();
    }
}
class TestClass{
    //int x;
}
class Run1 extends TestClass implements TestInterface,TestInterface2{
  //int x;
    @Override
    public void display() {

        System.out.println(x);
    }
}
