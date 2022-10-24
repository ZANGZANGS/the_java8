package the.java8.annotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE_USE)
@Repeatable(ChickenContainer.class)
//@Target(ElementType.TYPE_PARAMETER)
public @interface Chicken {
    String value();
}
