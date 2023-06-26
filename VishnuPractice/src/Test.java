public interface Test {
    default void fun(){
        System.out.println("interface test");
    }
}
interface Test4 {
    void click();
    default void fun(){
        System.out.println("interface test4");
    }
}
 class InterTest {
     Test4 t;
      void fun(){
          t.click();
      }
     public static void main(String[] args) {

     }
}
final class Student{
     int regNo;
     String name;
    Student(int regNo, String name) {
        this.regNo = regNo;
        this.name = name;
    }
    public void print(){
        System.out.println(regNo+" "+name);
    }
}
class Run implements AutoCloseable{

    public static void main(String[] args) {
       int arr1[]={0,10,20,30,40,50,60};
       int arr2[]={0,10,20,30,40,50,60};
char p=' ';
        System.out.println("()({)}[]()".replace("()",""));
    }
    static int binarySearch(int arr[],int start, int end, int elem){
        int mid=(end-start)/2+start;
        if(start>end){
            return -1;
        }
        else if(arr[mid]==elem){
            return mid;
        }else if(elem<arr[mid]){
            return binarySearch(arr,start,mid-1,elem);
        }else{
            return binarySearch(arr,mid+1,end,elem);
        }
    }

    @Override
    public void close() throws Exception {

    }
}
