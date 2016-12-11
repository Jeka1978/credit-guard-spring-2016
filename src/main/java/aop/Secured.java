package aop;/**
 * Created by Evegeny on 11/12/2016.
 */

import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

@Retention(RUNTIME)
public @interface Secured {
}
