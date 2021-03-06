package quoters;/**
 * Created by Evegeny on 06/12/2016.
 */

import org.springframework.beans.factory.annotation.Qualifier;

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
@Qualifier
public @interface QuoterCategory {
    Type value();
}
