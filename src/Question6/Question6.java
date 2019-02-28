/*Create and access default and static method of an interface.*/

package Question6;


public class Question6 implements TestDefaultInterface {

    public static void main(String[] args) {
        Question6 question6=new Question6();
        question6.display("hello");

        TestStatic.textStatic();
    }

}
