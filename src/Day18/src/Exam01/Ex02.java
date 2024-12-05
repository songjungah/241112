package Exam01;

import java.lang.reflect.Method;
import java.util.Arrays;

public class Ex02 {
    public static void main(String[] args) throws Exception {   // 메서드 전가
        Class<Person> cls = Person.class;
        MyAnno myAnno = cls.getAnnotation(MyAnno.class);

        // 값1 호출
        String value = myAnno.value();
        System.out.println(value);

        int max = myAnno.max();
        int[] number1 = myAnno.numbers();
        System.out.println("max : " + max);
        System.out.println(Arrays.toString(number1));
        
        // 값3 호출
        Method method = cls.getMethod("method", String.class);
        MyAnno myAnno2 = method.getAnnotation(MyAnno.class);
        String value2 = myAnno2.value();
        System.out.println(value2);

        int max2 = myAnno2.max();
        int[] numbers2 = myAnno2.numbers();
        System.out.println("max : " + max2);
        System.out.println(Arrays.toString(numbers2));


    }
}