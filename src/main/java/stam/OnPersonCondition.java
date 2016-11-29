package stam;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by Evegeny on 29/11/2016.
 */
public class OnPersonCondition implements Condition {
    @Override
        public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return true;
    }
}
