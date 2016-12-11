package aop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.stereotype.Component;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Configuration
@EnableAspectJAutoProxy
@EnableScheduling
@ComponentScan(basePackages = "aop")
public class Conf {
}
