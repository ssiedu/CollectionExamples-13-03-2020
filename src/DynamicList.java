
import java.util.ArrayList;
import java.util.Scanner;


public class DynamicList {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("How Many List You Want ? ");
        int n=sc.nextInt();
        
        ArrayList<ArrayList<String>> lists=new ArrayList<>();
        
        for(int i=1; i<=n; i++){
            ArrayList<String> list=new ArrayList<>();
            lists.add(list);
        }
        
        
        

        
        
    }
}
