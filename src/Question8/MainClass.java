/*Implement multiple inheritance with default method inside  interface.*/
package Question8;

public class MainClass implements Class1,Class2 {
    @Override
    public void display(){
        System.out.println("Mainclass");
    }

    public static void main(String[] args) {
        MainClass mainClass=new MainClass();
        mainClass.display();
    }
}
