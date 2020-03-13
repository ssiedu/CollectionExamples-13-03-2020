
public class TestCollection {

    public static int[] compute(int n){
        
        
        //to return square and cube of the given no
        int res[]=new int[2];
        res[0]=n*n;
        res[1]=n*n*n;
        return res;

    }
    
    public static void main(String[] args) {
        int result[]=compute(10);
        System.out.println(result[0]);
        System.out.println(result[1]);
    }
}
