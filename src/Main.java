import com.day4.ExceptionHandling;
import com.day4.MyExp;
public class Main {

    public static void main(String[] args) {

        try {
            new ExceptionHandling().SayHi();
            System.out.println("Tried");
        }
        catch (MyExp e){
            System.out.println("Error says :"+e.getMessage());
        }

    }

}