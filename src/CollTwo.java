
import java.util.ArrayList;


public class CollTwo {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("one"); 
        list.add("two");
        list.add("three");
        int n=list.size();
        boolean b=list.isEmpty();
        //System.out.println(n);
        //System.out.println(b);
        //System.out.println(list);
        //list.clear();
        //list.remove("two");
        boolean result=list.contains("two");
        System.out.println(list);
        System.out.println(result);
        
    }
}
/*
    size, isEmpty, add, clear
*/
