package Exam03;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyApplication2 extends MyApplication{  // Ctrl + O > method 단축키


    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("클릭!");
    }
}
