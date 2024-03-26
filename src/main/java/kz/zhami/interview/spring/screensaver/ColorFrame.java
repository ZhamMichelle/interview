package kz.zhami.interview.spring.screensaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

@Component
//@Scope("prototype")
public abstract class ColorFrame extends JFrame {
    public ColorFrame() {
        setSize(200, 100);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void showOnRandomPlace() {
        Random random = new Random();
        setLocation(random.nextInt(1200), random.nextInt(1000));
        getContentPane().setBackground(getColor());
        repaint();
    }

    protected abstract Color getColor();
}
