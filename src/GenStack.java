
import java.util.Stack;


public class GenStack {
    public static void main(String[] args) {

        Stack<String> stk1=new Stack<>();
        stk1.push("ab"); stk1.push("cd");
        //stk1.push(10); stk1.push(20);
        String res1=stk1.pop();
        System.out.println(res1);
        
        Stack<Integer> stk2=new Stack<>();
        stk2.push(10); stk2.push(20);
        //stk2.push("ab"); stk2.push("cd");
        int res2=stk2.pop();
        System.out.println(res2);
        
        Stack stk3=new Stack();
        stk3.push("xx"); stk3.push(true);
        stk3.push(1.5); stk3.push(25);
        
        Integer i1=(Integer)stk3.pop();
        System.out.println(i1);
        
        
    }
}
