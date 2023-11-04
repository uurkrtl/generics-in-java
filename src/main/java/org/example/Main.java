package org.example;

public class Main {
    public static void main(String[] args) {

        //Generic Class
        Integer a = 10;
        String b = "Ugur";
        Double c = 3.14;
        GenericClass<Integer, String, Double> gc = new GenericClass<>(a,b,c);
        gc.print();

        //Generic Method
        GenericMethod gm = new GenericMethod();
        gm.print(new Integer[]{1,2,3,3,6,9});

        //Generic Interface
        Customer customer = new Customer(1,"Ugur","Kartal Gmbh");
        Manager<Customer> customerManager = new Manager<>();
        customerManager.getAll(customer);

        Employee employee = new Employee(1,"Kartal");
        Manager<Employee> employeeManager = new Manager<>();
        employeeManager.getAll(employee);
    }
}