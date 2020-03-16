
import java.util.Arrays;


public class ArraysDemo {

    public static void main(String[] args) {
        int x[]={10,20,5,15,14,22,19,100,45,51};
        for(int tmp:x){
            System.out.print(tmp+"  ");
        }
        System.out.println();
        Arrays.sort(x);
        System.out.println("After Sorting...........");
        for(int tmp:x){
            System.out.print(tmp+"  ");
        }
        System.out.println();
        int idx=Arrays.binarySearch(x, 22);
        System.out.println("Index of 22 : "+idx);
    }
}
