
import java.util.ArrayList;
import java.util.Collections;


public class EmployeeSorting {

    public static void main(String[] args) {

        Employee e1=new Employee(1501,"AAA",50000);
        Employee e2=new Employee(2001,"BBB",25000);
        Employee e3=new Employee(1904,"CCC",55000);
        Employee e4=new Employee(1001,"DDD",25000);
        
        ArrayList<Employee> employees=new ArrayList<>();
        employees.add(e1); employees.add(e2); 
        employees.add(e3); employees.add(e4);
        for(Employee employee:employees){
            System.out.println(employee);
        }
        Collections.sort(employees);
        System.out.println("After-Sorting..........");
        for(Employee employee:employees){
            System.out.println(employee);
        }
        
        
        
        
    }
}
