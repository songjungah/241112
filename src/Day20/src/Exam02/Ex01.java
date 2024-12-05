package Exam02;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

public class Ex01 {
    public static void main(String[] args) {
        // BiFunction<Integer, Integer, Integer> calc = (a, b) -> a + b;

        // BinaryOperator<Integer> calc = (a, b) -> a + b;    // a.intValue() + b.intValue()

        // int result = calc.apply(10, 20);
        // System.out.println(result);


        IntBinaryOperator calc = (a, b) -> a + b;
        int result = calc.applyAsInt(10, 20);
        System.out.println(result);
    }
}
