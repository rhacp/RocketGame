package com.rocket_team.space_adventure.models.entities.part;

import com.rocket_team.space_adventure.exceptions.part.IllegalPartTypeException;
import com.rocket_team.space_adventure.models.dtos.PartDTO;
import com.rocket_team.space_adventure.utils.enums.PartType;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
public class PartFactory {

    private final ModelMapper modelMapper;

    public PartFactory(ModelMapper modelMapper) {
        this.modelMapper = modelMapper;
    }

    public Part createPart(PartDTO partDTO) {
        switch (partDTO.getPartType().toLowerCase()) {
            case "type cone" -> {
                PartCone partCone = modelMapper.map(partDTO, PartCone.class);
                partCone.setPartType(PartType.TYPE_CONE);
                return partCone;
            }
            default -> throw new IllegalPartTypeException("Not a valid part type.");
        }
    }
}
