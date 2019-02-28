/*Create an Employee Class with instance variables (String) name, (Integer)age, (String)city
and get the instance of the Class using constructor reference */

package Question4;



public class Question4 {

    public static void main(String[] args) {
        CreateEmployeeInstance createEmployeeInstance=Employee::new;
        Employee e=createEmployeeInstance.create("Vineet" ,22,"Muzaffarnagar");
        
        System.out.println(e.toString());
    }

}
