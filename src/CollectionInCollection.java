
import java.util.ArrayList;
import java.util.Stack;


public class CollectionInCollection {

    public static void main(String[] args) {

        ArrayList<String> csList=new ArrayList();
        csList.add("A"); csList.add("B"); csList.add("C");
        //System.out.println(csList); 
        
        ArrayList<String> itList=new ArrayList();
        itList.add("X"); itList.add("Y"); itList.add("Z");
        //System.out.println(itList);
        
        Stack<ArrayList<String>> stk=new Stack<>();
        stk.push(itList);
        stk.push(csList);
        
        
        ArrayList<String> list1=stk.pop();
        
        for(String item:list1){
            System.out.println(item);
        }
        System.out.println("__________________________");
        ArrayList<String> list2=stk.pop();
        for(String item:list2){
            System.out.println(item);
        }
        
        
        
    }
}
