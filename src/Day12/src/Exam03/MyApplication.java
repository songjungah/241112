package Exam03;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyApplication implements MouseListener {   // Ctri + I > Implement 메서드 단축키

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("구현!");
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}