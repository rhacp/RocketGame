package com.rocket_team.space_adventure.validations;

import com.rocket_team.space_adventure.utils.enums.PartType;
import jakarta.validation.Constraint;
import jakarta.validation.Payload;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

@Target({METHOD, FIELD, ANNOTATION_TYPE, CONSTRUCTOR, PARAMETER, TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Constraint(validatedBy = EnumPartTypePatternValidator.class)
public @interface EnumPartTypePattern {

    String[] anyOf();

    String message() default "Must be: Type Cone or Type One";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
