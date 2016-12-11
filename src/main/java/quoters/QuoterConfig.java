package quoters;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Configuration
@ComponentScan(basePackages = "quoters")
@PropertySource("classpath:qoutes.properties")
@EnableAspectJAutoProxy
public class QuoterConfig {
}
