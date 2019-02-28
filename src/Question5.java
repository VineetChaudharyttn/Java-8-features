/*Implement following functional interfaces from java.util.function using lambdas:

(1) Consumer

(2) Supplier

(3) Predicate

(4) Function*/

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Question5 {

    public static void main(String[] args) {
        Consumer<Integer> consumer = num -> System.out.println(num);
        consumer.accept(23);

        Supplier<String> stringSupplier = () -> "This is supplier";
        System.out.println(stringSupplier.get());

        Predicate<Integer> predicate = num1 -> num1 % 3 == 0;
        System.out.println(predicate.test(55));

        Function<Integer, Integer> function = num3 -> num3 * num3;
        System.out.println(function.apply(5));

    }
}
