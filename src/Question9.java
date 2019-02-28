/*Collect all the even numbers from an integer list.*/
import java.util.Arrays;
import java.util.List;

public class Question9 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(3,7,8,9,2,1,6,4,5);
        list.stream().filter(e-> e%2==0).forEach(System.out::println);


    }

}
