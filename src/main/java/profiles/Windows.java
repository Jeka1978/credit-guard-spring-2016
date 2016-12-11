package profiles;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Created by Evegeny on 11/12/2016.
 */
@Retention(RetentionPolicy.RUNTIME)
@Conditional(WindowsDetector.class)
public @interface Windows {
    boolean value();
}
