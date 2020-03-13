
import java.util.ArrayList;
import java.util.Stack;

public class CollectionInCollectionTwo {
    public static void main(String[] args) {

        ArrayList<String> csList=new ArrayList();
        csList.add("A"); csList.add("B"); csList.add("C");
        
        ArrayList<String> itList=new ArrayList();
        itList.add("X"); itList.add("Y"); itList.add("Z");
        

        ArrayList<ArrayList<String>> allStud=new ArrayList<>();
        allStud.add(csList);
        allStud.add(itList);
        
        
        for(ArrayList<String> list:allStud){
            
            for(String item:list){
                System.out.println(item);
            }
            System.out.println("___________________");
        }
        
        
        
    }
}
