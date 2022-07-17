import java.sql.Array;
import java.util.*;

public class Day1 {
    public static void main(String[] args) {
        sol5();
    }

    static void sol1(){
        // Fibonaci
        int a = 0, b = 1, c = a+b , times = 20, sum = 0;

        while(times-- != 0){
            sum += b;
            System.out.print(b+" ");
            c = a + b ;
            a = b;
            b = c;
        }
        System.out.println((double) sum/ 20);
    }
    static void sol2(){

        System.out.print("Enter the number of students: ");

        Scanner s = new Scanner(System.in);
        int numStudents = s.nextInt();

        int grades[] = new int[numStudents];

        for (int i = 0; i < numStudents; ) {
            System.out.print("Enter the grade for student "+(i+1)+": ");
            int temp = s.nextInt();
            if (temp > 100 || temp < 0){
                System.out.println("Invalid grade, try again...");
                continue;
            }

            grades[i] = temp;
            i++;
        }
        System.out.println(Arrays.stream(grades).average().orElse(0.0));
    }
    static void sol3(){
        int array[] = new int[10];
        for (int i = 0; i < array.length; i++)
            array[i] = (int) (Math.random()*100);

        int copiedArray[] = copyOf(array);
        for (int element :
                copiedArray) {
            System.out.print(element + " ");
        }
    }

    static void sol5(){

        Integer day = 0, month = 0, year = 0;
        try(Scanner scanner = new Scanner(System.in)){


            System.out.print("day: ");
            day = scanner.nextInt();
            System.out.print("month: ");
            month = scanner.nextInt();
            System.out.print("year: ");
            year = scanner.nextInt();

        }
        catch (Exception ex){
            System.out.println(ex);
            System.exit(0);
        }
        System.out.println("Entered Date is "+day+"/"+month+"/"+year);

        Integer longMonths[] = {1,31,28,31,30,31,30,31,31,30,31,30,31};


    }
    static int[] copyOf(int[] array){
        int temp[] = new int[array.length];
        for (int i = 0; i < array.length; i++)
            temp[i] = array[i];
        return temp;
    }
}
