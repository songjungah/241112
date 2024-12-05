package Exam03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Ex02 {
    public static void main(String[] args) {
        FileInputStream fis = null;

        try {
            fis = new FileInputStream("b.txt");

            fis.close();    // 문제가 없을 때만 자원해제가 됨 > But, 문제가 없어도 자원해제가 되어야함
            System.out.println("자원 해제 완료!");

        } catch (IOException e){
            e.printStackTrace();
            if (fis != null) {
                try {
                    fis.close();

                } catch (IOException e2) {}

                System.out.println("자원 해제 완료!");
            }
        }

    }
}
