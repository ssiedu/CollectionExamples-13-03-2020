
import java.util.ArrayList;
import java.util.HashMap;

public class CollectionInCollectionThree {
    public static void main(String[] args) {

        ArrayList<String> csList = new ArrayList();
        csList.add("A");
        csList.add("B");
        csList.add("C");

        ArrayList<String> itList = new ArrayList();
        itList.add("X");
        itList.add("Y");
        itList.add("Z");

        HashMap<String,ArrayList<String>> map=new HashMap<>();
        map.put("cs", csList);
        map.put("it", itList);
        //ArrayList<String> list=map.get("cs");
        ArrayList<String> list=map.get("it");
        for(String item:list){
            System.out.println(item);
        }
        
        
        
        
        
        
        
    }
}
