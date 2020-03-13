public class Emp<T1,T2> {
    
    T1 eno;
    String ename;
    T2 sal;

    public void setEno(T1 eno) {
        this.eno = eno;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public void setSal(T2 sal) {
        this.sal = sal;
    }

    public void show(){
        System.out.println(eno.getClass().getName());
        System.out.println(ename.getClass().getName());
        System.out.println(sal.getClass().getName());
    }
    
}
