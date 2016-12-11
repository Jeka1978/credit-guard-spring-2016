package exceptionsAop;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Configuration
@EnableScheduling
@EnableAspectJAutoProxy
@ComponentScan(basePackages = "exceptionsAop")
@PropertySource("classpath:mails.properties")
public class MyConf {
}
