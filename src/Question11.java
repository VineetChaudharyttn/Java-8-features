/*Find average of the number inside integer list after doubling it.*/
import java.util.Arrays;
import java.util.List;

public class Question11 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(2,3,66,7,11,2,44,87,65);
        System.out.println(list.stream().mapToDouble(e->e).average());
    }
}
