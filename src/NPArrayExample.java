
public class NPArrayExample {
    public static void main(String[] args) {

        Employee e[]={new Employee(111,"A",50000), new Employee(112,"B",63000), new Employee(113,"C",90000)};
        /*
        Employee e[]=new Employee[3];
        
        for(Employee emp:e){
            System.out.println(emp);
        }
        System.out.println("_________________________________________________________________");
        e[0]=new Employee(111,"AAA",10000);
        e[1]=new Employee(112,"BBB",20000);
        e[2]=new Employee(113,"CCC",30000);
        */
        for(Employee emp:e){
            System.out.println(emp);
        }        
        
    }
}
