package com.codegym.demo_a08_spring_boot.utils.annotation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PointValidator implements ConstraintValidator<PointFormat, Double> {


    @Override
    public void initialize(PointFormat constraintAnnotation) {
        ConstraintValidator.super.initialize(constraintAnnotation);
    }

    @Override
    public boolean isValid(Double value, ConstraintValidatorContext context) {

        return value.isNaN();
    }


}
