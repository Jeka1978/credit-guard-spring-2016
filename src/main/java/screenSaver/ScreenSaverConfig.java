package screenSaver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

import javax.annotation.PostConstruct;
import java.awt.*;
import java.util.Random;

/**
 * Created by Evegeny on 11/12/2016.
 */

@Configuration
@ComponentScan(basePackages = "screenSaver")
public class ScreenSaverConfig {
    private Random random = new Random();

    @Value("${JAVA_HOME}")
    private String javaHome;

    @PostConstruct
    public void prepareConfig() {
        System.out.println("1231231");
    }


    @Bean
    @Scope(value = "prototype")
    public Color randomColor() {

        Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
       
        return color;
    }

    @Bean
    @Scope("prototype")
    public ColorFrame colorFrame(){
        ColorFrame colorFrame = new ColorFrame() {
            @Override
            protected Color getColorBean() {
                return randomColor();
            }
        };
        colorFrame.setTitle(javaHome);
        return colorFrame;
    }




}











