package com.codegym.demo_a08_spring_boot.utils.annotation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Target({ElementType.FIELD, ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = PointValidator.class)
public @interface PointFormat {
    String message() default "Point không đúng";
    Class<?> [] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
