package com.rocket_team.space_adventure.services.part;

import com.rocket_team.space_adventure.exceptions.part.PartAlreadyExistsException;
import com.rocket_team.space_adventure.models.dtos.PartDTO;
import com.rocket_team.space_adventure.models.entities.part.Part;
import com.rocket_team.space_adventure.repositories.PartRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class PartServiceValidationImpl implements PartServiceValidation{

    private final PartRepository partRepository;

    public PartServiceValidationImpl(PartRepository partRepository) {
        this.partRepository = partRepository;
    }

    @Override
    public void validatePartAlreadyExists(PartDTO partDTO) {
        Part partFoundFirst = partRepository.findByName(partDTO.getName());
        Part partFoundSecond = partRepository.findBySpeedAndShieldAndFuel(partDTO.getSpeed(), partDTO.getShield(), partDTO.getFuel());

        if (partFoundFirst != null) {
            throw new PartAlreadyExistsException("A part with the name " + partDTO.getName() + " already exists.");
        }

        if (partFoundSecond != null) {
            throw new PartAlreadyExistsException("A part with with the stats " +  partDTO.getSpeed() + " " + partDTO.getShield() + " " + partDTO.getFuel() + " stats already exists.");
        }
    }
}
