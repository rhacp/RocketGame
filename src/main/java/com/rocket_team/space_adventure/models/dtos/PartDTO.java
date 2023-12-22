package com.rocket_team.space_adventure.models.dtos;

import com.rocket_team.space_adventure.utils.enums.PartType;
import com.rocket_team.space_adventure.validations.EnumPartTypePattern;
import jakarta.validation.constraints.*;
import lombok.Data;

@Data
public class PartDTO {

    @NotBlank
    @Size(min = 3, max = 30, message = "must be between 3 and 30 characters")
    private String name;

    @NotBlank
    @Size(min = 3, max = 200, message = "must be between 3 and 200 characters")
    private String description;

    @EnumPartTypePattern(anyOf = {"type cone", "type one"})
    private String partType;

    @NotNull
    @DecimalMax("100")
    @DecimalMin("-100")
    private Integer speed;

    @NotNull
    @DecimalMax("100")
    @DecimalMin("-100")
    private Integer shield;

    @NotNull
    @DecimalMax("100")
    @DecimalMin("-100")
    private Integer fuel;
}
