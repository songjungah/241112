package Exam02;

public class Ex01 {
    public static void main(String[] args) {
        Book book = new Book("책1", "저자1", "출판사1");
        System.out.println(book);   // book.toString() : 컴파일러가 자동 코드를 추가!
        System.out.println(book.toString());


    }
}
