import com.day3.test1.*;

public class Main {

    public static void main(String[] args) {
        //System.out.println("args = " + Arrays.deepToString(args));
        Car c = new Car();
        System.out.println("c = " + c);

        Test1 t = new Test1();
        System.out.println("t.A = " + t.A);
        t.sayHello();

//        Boolean b = Boolean.TRUE;

    }

}