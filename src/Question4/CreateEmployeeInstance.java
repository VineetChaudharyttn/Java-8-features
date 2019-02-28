package Question4;

@FunctionalInterface
interface CreateEmployeeInstance{
    Employee create(String name,int age, String city);
}
