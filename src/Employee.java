public class Employee implements Comparable<Employee> {
    private int eno;
    private String ename;
    private int sal;

    public Employee(int eno, String ename, int sal) {
        this.eno = eno;
        this.ename = ename;
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "Employee{" + "eno=" + eno + ", ename=" + ename + ", sal=" + sal + '}';
    }

    @Override
    public int compareTo(Employee other) {
        if(sal>other.sal){
            return 1;
        }else if(sal<other.sal){
            return -1;
        }else{
            if(eno>other.eno){
                return 1;
            }else if(eno<other.eno){
                return -1;
            }else{
                return 0;
            }
        }

    }
    
    
}
