
import java.util.LinkedList;
import java.util.Stack;


public class StackDemo {

    public static void main(String[] args) {
        
        Stack stk=new Stack();
        stk.push("abc");    
        stk.push(10);//stk.push(new Integer(10));
        stk.push(2.5);//stk.push(new Double(2.5));
        
        Double d1=(Double)stk.pop();
        //double d2=d1.doubleValue();
        System.out.println(d1*2);
        
        
        
        
    }
}
