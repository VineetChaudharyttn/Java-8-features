package Question7;

interface TestOverride {
    default void display(){
        System.out.println("default display");
    }
}
