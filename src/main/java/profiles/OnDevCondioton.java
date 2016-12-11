package profiles;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by Evegeny on 11/12/2016.
 */
public class OnDevCondioton implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return !System.getenv().get("COMP_TYPE").equals("AM");
    }
}
