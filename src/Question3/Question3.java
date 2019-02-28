package Question3;

/*Using (instance) Method reference create and apply add and subtract method and using (Static) Method
reference create and apply multiplication method for the functional interface created.*/



public class Question3 {
    int add(int a,int b){
        return a+b;
    }
    int subtract(int a,int b){
        return a-b;
    }
    static int multiplecation(int a,int b){
        return a*b;
    }

    public static void main(String[] args) {
        Operation operate=new Question3()::add;
        System.out.println(operate.operation(3,4));
        
        operate=new Question3()::subtract;
        System.out.println(operate.operation(4,5));
        
        operate=Question3::multiplecation;
        System.out.println(operate.operation(5,6));
    }
}
