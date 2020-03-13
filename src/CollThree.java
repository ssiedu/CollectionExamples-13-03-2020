
import java.util.ArrayList;


public class CollThree {

    public static void main(String[] args) {
        ArrayList<String> l1=new ArrayList<>();
        ArrayList<String> l2=new ArrayList<>();
        l1.add("one"); l1.add("two"); l1.add("three");
        l2.add("four"); l2.add("five"); l2.add("six");
        
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("____________________________________________");
        l2.addAll(l1);//copy all items from l1 to l2
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("____________________________________________");
        //l2.removeAll(l1);
        l2.retainAll(l1);
        System.out.println(l1);
        System.out.println(l2);
        System.out.println("____________________________________________");
    }
}

//addAll, removeAll, retainAll, 
