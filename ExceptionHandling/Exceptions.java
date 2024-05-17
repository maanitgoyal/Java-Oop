package ExceptionHandling;

public class Exceptions {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        try {
//            int c = a / b;
            divide(a, b);

        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("This will still run.");
        }
    }

    static int divide(int a, int b) throws Exception
     {
        if(b==0){
            throw new ArithmeticException("Divide by zero");
        }
        return a/b;
    }
}
