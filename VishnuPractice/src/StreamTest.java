import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;

public class StreamTest {
    public static void main(String[] args) {
        int[] arr={1};
        Arrays.stream(arr);
        List <String> list = null;
        //list.stream().map()

        OptionalInt max= Arrays.stream(arr).max();
max.getAsInt();
        System.out.println(max.isPresent());
    }
}
