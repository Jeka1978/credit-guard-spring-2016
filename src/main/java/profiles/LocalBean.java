package profiles;/**
 * Created by Evegeny on 11/12/2016.
 */

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Conditional(OnDevCondioton.class)
public @interface LocalBean {
}
