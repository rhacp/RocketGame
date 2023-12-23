package com.rocket_team.space_adventure.services.part;

import com.rocket_team.space_adventure.models.dtos.PartDTO;

public interface PartServiceValidation {

    void validatePartAlreadyExists(PartDTO partDTO);
}
