package Exam01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Ex02 {
    public static void main(String[] args) {
        List<String> items = new LinkedList<>();
        items.add("항목1");
        items.add("항목2");
        items.add("항목3");
        items.add("항목4");
        items.add("항목5");

        Iterator<String> itr = items.iterator();    // 계속 이동할 때마다 이 주소가 이용
        while (itr.hasNext()) {
            String item = itr.next();
            System.out.println(item);
        }

        itr = items.iterator();
        while (itr.hasNext()) {
            String item = itr.next();
            System.out.println(item);
        }
    }
}
