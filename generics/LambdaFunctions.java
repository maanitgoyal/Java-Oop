package generics;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaFunctions {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arr.add(i);
        }
//        arr.forEach((item) ->
//                {System.out.println(item*2);}
//        );

        Consumer<Integer> fun = item -> System.out.println(item*2);
        arr.forEach(fun);

//        Operation sum = (a,b) -> a+b;
//        another way to write this one
        Operation sum = Integer::sum;
        Operation prod = (a,b) -> a*b;
        Operation sub = (a,b) -> a-b;

        LambdaFunctions fun2 = new LambdaFunctions();

        System.out.println(fun2.operate(2,3,sum));


    }
    private int operate(int a, int b, Operation op) {
                return op.Operation(a,b);
    }

}

interface Operation{
    int Operation(int a, int b);
}
