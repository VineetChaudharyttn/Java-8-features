/*Override the default method of the interface.*/
package Question7;

public class DefaultOverride implements TestOverride {
    @Override
    public void display(){
        System.out.println("Main Display");
    }
    public static void main(String[] args) {
        DefaultOverride defaultOverride=new DefaultOverride();
        defaultOverride.display();
    }
}
