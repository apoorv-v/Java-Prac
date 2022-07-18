public class Tester {
    public static void main(String[] args) {
        try {
            throw new Error();
        }
        catch (Exception e) {
            System.out.print("B");
        }
        catch (Throwable e) {
            System.out.print("C");
        }
        finally {
            System.out.print("D"); //
        System.out.println("E");
    }


}
}