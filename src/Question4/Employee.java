package Question4;

public class Employee {
    String name;
    int age;
    String city;

    public Employee (String name,int age,String city){
        this.age=age;
        this.name=name;
        this.city=city;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                '}';
    }
}
