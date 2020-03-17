
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class CollectionsDemo {
    public static void main(String[] args) {

        ArrayList<String> cities=new ArrayList<>();
        cities.add("delhi"); cities.add("bhopal");
        cities.add("chennai"); cities.add("mumbai");
        cities.add("jaipur"); cities.add("pune");
        
        System.out.println(cities);
        Collections.sort(cities);
        System.out.println(cities);
        
        //int idx=Collections.binarySearch(cities, "delhi");
        //System.out.println("Index of delhi : "+idx);
        
    }
}
