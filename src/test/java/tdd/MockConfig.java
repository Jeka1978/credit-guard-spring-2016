package tdd;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.annotation.PostConstruct;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Configuration
@ComponentScan(basePackages = "tdd")
public class MockConfig {

    public static int x = 1;

    @PostConstruct
    public void init() {
        x++;
        System.out.println("Config for mock objects is started");
    }

    @Bean
    @Primary
    public MaamService maamServiceMock() {
        MaamService mock = Mockito.mock(MaamService.class);
        Mockito.when(mock.getMaam()).thenReturn(0.17);
        return mock;
    }
}
