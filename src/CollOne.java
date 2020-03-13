
import java.util.ArrayList;
import java.util.Vector;


public class CollOne {

    public static void main(String[] args) {
        
        //TreeSet<String> items=new TreeSet<>();
        //LinkedHashSet<String> items=new LinkedHashSet<>();
        //HashSet<String> items=new HashSet<>();
        ArrayList<String> items=new ArrayList<>(20);
        
        items.add("rajesh");
        items.add("suresh");
        items.add("john");
        items.add("prakash");
        items.add("smith");
        items.add("chetan");
        System.out.println(items);
        //items.add(1,"manish");
        //items.remove(1);
        //System.out.println(items.get(1));
        /*
        for(String item:items){
            System.out.println(item);
        }
        System.out.println(items.size());
        */
    }
}
