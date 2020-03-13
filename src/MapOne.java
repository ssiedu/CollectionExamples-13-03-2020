
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class MapOne {
    public static void main(String[] args) {

        //HashMap<String,String> map=new HashMap<>();
        //LinkedHashMap<String,String> map=new LinkedHashMap<>();
        TreeMap<String,String> map=new TreeMap<>();
        map.put("pm","Mr. Modi");
        map.put("hm", "Mr. Shah");
        map.put("dm", "Mr. R.Singh");
        map.put("fm", "Mrs. N.Sitaraman");
        
        System.out.println(map);
        
        //String val=map.get("dm");
        //System.out.println(val);
        
        
        //boolean b=map.containsKey("pm");
        //boolean b=map.containsValue("Mr. Modi");
        //System.out.println(b);
        
        /*
        HashMap<Integer,String> map=new HashMap<>();
        map.put(1,"Sunday");
        map.put(2,"Monday");
        map.put(3,"Tuesday");
        map.put(4,"Wednesday");
        map.put(5,"Thursday");
        map.put(6,"Friday");
        map.put(7,"Saturday");
        //System.out.println(map);
        String res=map.get(11);
        System.out.println(res);
        */
        
    }
}
//put, get, size, isEmpty, containsKey, containsValue
//putAll
