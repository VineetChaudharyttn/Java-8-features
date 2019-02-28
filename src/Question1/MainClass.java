/*Write the following a functional interface and implement it using lambda:
(1) First number is greater than second number or not             Parameter (int ,int ) Return boolean
(2) Increment the number by 1 and return incremented value    Parameter (int) Return int
(3) Concatination of 2 string                                 Parameter (String , String ) Return (String)
(4) Convert a string to uppercase and return .                Parameter (String) Return (String)*/

package Question1;

public class MainClass {
    public static void main(String[] args) {
        CheckGreater checkGreater = (a, b) -> a > b ? true : false;
        System.out.println(checkGreater.greater(35, 4));

        ConcateTwoString concateTwoString = (str1, str2) -> str1 + " " + str2;
        System.out.println(concateTwoString.concatString("Dhanendra", "kumar"));

        ConvertIntoUpperAndReturn convertIntoUpperAndReturn = (str) -> str.toUpperCase();
        System.out.println(convertIntoUpperAndReturn.upperCaseConveter("dhanendra"));

        IncrementAndReturn incrementAndReturn=(num)->++num;
        System.out.println(incrementAndReturn.increment(419));
    }
}
