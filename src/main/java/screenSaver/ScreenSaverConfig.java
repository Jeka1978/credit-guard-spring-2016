package screenSaver;

import org.springframework.context.annotation.*;
import org.springframework.scheduling.annotation.EnableScheduling;

import java.awt.*;
import java.util.Random;

/**
 * Created by Evegeny on 11/12/2016.
 */

@Configuration
@ComponentScan(basePackages = "screenSaver")
public class ScreenSaverConfig {
    private Random random = new Random();

    @Bean
    @Scope(value = "prototype", proxyMode = ScopedProxyMode.TARGET_CLASS)
    public Color randomColor() {
        Color color = new Color(random.nextInt(255), random.nextInt(255), random.nextInt(255));
        return color;
    }



}











