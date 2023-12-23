package com.rocket_team.space_adventure.utils.enum_converters;

import com.rocket_team.space_adventure.utils.enums.PartType;
import jakarta.persistence.AttributeConverter;
import jakarta.persistence.Converter;

import java.util.stream.Stream;

@Converter(autoApply = true)
public class PartTypeConvertor implements AttributeConverter<PartType, String> {

    @Override
    public String convertToDatabaseColumn(PartType partType) {
        if (partType == null) {
            return null;
        }

        return partType.getStatusLabel();
    }

    @Override
    public PartType convertToEntityAttribute(String partTypeLabel) {
        if (partTypeLabel == null) {
            return null;
        }

        return Stream.of(PartType.values())
                .filter(partType -> partType.getStatusLabel().equals(partTypeLabel))
                .findFirst()
                .orElseThrow(IllegalArgumentException::new);
    }
}
