package com.rocket_team.space_adventure.validations;

import jakarta.validation.ConstraintValidator;
import jakarta.validation.ConstraintValidatorContext;

import java.util.Arrays;

public class EnumPartTypePatternValidator implements ConstraintValidator<EnumPartTypePattern, String> {

    private String[] subset;

    @Override
    public boolean isValid(String value, ConstraintValidatorContext constraintValidatorContext) {
        return value == null || Arrays.asList(subset).contains(value.toLowerCase());
    }

    @Override
    public void initialize(EnumPartTypePattern constraintAnnotation) {
        this.subset = constraintAnnotation.anyOf();
    }
}
