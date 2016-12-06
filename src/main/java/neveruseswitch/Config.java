package neveruseswitch;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Evegeny on 06/12/2016.
 */
@Configuration
@ComponentScan(basePackages = "neveruseswitch")
@EnableScheduling
public class Config {
}
