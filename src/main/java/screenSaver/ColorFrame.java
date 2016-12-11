package screenSaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.swing.*;
import java.awt.Color;
import java.util.Random;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Component
public class ColorFrame extends JFrame {

    private Random random = new Random();

    @Autowired
    private Color color;

    @PostConstruct
    public void init(){
        System.out.println(color.getClass());
        System.out.println(color);
        System.out.println(color);
        System.out.println(color);
        setSize(150,150);
        setVisible(true);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public void moveToRandomLocation(){
        setLocation(random.nextInt(1000),random.nextInt(800));
        getContentPane().setBackground(color);
        repaint();
    }












}
