/*Create a functional interface whose method takes 2 integers and return one integer.*/

package Question2;

public class MainClass {
    public static void main(String[] args) {
        AcceptTwoIntegerAndOne acceptTwoIntegerAndOne = (a, b) -> a * b;
        System.out.println(acceptTwoIntegerAndOne.operation(8,9));
    }
}
