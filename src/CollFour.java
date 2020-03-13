
import java.util.ArrayList;
import java.util.Iterator;


public class CollFour {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        list.add("java"); list.add("php"); list.add("python");
        
        for(int i=0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
        
        /*
        Object ar[]=list.toArray();
        for(int i=0; i<ar.length; i++){
            System.out.println(ar[i]);
        }
        */
        /*
        for(String item:list){
            System.out.println(item);
        }
        */
        /*
        //iterators are used for iterating a collection.
        Iterator<String> it=list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        */
    }
}
/*
    different ways to iterate a collection
    (going through each element)

    1) using iterator
    2) using foreach loop
    3) convert collection to an array, iterate array


*/