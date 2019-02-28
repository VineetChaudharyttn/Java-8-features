package Question6;


interface TestDefaultInterface{
    default void display(String s){
        System.out.println("Default Display "+s);
    }
}
