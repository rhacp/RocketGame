package com.rocket_team.space_adventure.services.part;

import com.rocket_team.space_adventure.models.dtos.PartDTO;

import java.util.List;

public interface PartService {

    PartDTO createPart(PartDTO partDTO);

    List<PartDTO> getAllParts();
}
