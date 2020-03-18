
public class OneDArrayExample {

    public static void main(String[] args) {

        boolean b[] = new boolean[3];
        for (boolean val : b) {
            System.out.println(val);
        }
        System.out.println(b.length);
        b[1] = true;
        for (boolean val : b) {
            System.out.println(val);
        }

        /*
        int x[]=new int[4];
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x.length);
        System.out.println("__________________________________________");
        x[0]=10;
        x[1]=20;
        x[2]=30;
        x[3]=40;
        System.out.println(x[0]);
        System.out.println(x[1]);
        System.out.println(x[2]);
        System.out.println(x[3]);
        System.out.println(x.length);
        System.out.println("__________________________________________");
         */
    }
}
