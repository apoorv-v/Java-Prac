import java.lang.reflect.Array;

public class Main {

    static void func(){

    }

    public static void main(String[] args) {
        int a[] = {1,2,3};
        printArr(a);
    }

    private static void printArr(int[] a) {
        for (int el:
                a) {
            System.out.print(el + " ");
        }
    }


}