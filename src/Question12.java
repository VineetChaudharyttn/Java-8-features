/*Find the first even number in the integer list which is greater than 3.*/

import java.util.Arrays;
import java.util.List;

public class Question12 {
    public static void main(String[] args) {
        List<Integer> list= Arrays.asList(5,2,3,6,10,8,9);
        System.out.println(list.stream().filter(e->e>3).filter(e->e%2==0).findFirst());
    }
}
