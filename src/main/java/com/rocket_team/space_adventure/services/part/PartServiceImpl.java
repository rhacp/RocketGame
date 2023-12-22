package com.rocket_team.space_adventure.services.part;

import com.rocket_team.space_adventure.models.dtos.PartDTO;
import com.rocket_team.space_adventure.models.entities.part.Part;
import com.rocket_team.space_adventure.models.entities.part.PartFactory;
import com.rocket_team.space_adventure.repositories.PartRepository;
import lombok.extern.slf4j.Slf4j;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class PartServiceImpl implements PartService{

    private final PartRepository partRepository;
    private final PartServiceValidation partServiceValidation;
    private final ModelMapper modelMapper;
    private final PartFactory partFactory;

    public PartServiceImpl(PartRepository partRepository, PartServiceValidation partServiceValidation, ModelMapper modelMapper, PartFactory partFactory) {
        this.partRepository = partRepository;
        this.partServiceValidation = partServiceValidation;
        this.modelMapper = modelMapper;
        this.partFactory = partFactory;
    }

    @Override
    public PartDTO createPart(PartDTO partDTO) {
        partServiceValidation.validatePartAlreadyExists(partDTO);

        Part part = partFactory.createPart(partDTO);
        Part savedPart = partRepository.save(part);
        log.info("Part {} : {} : {} inserted in db.", savedPart.getId(), savedPart.getName(), savedPart.getPartType());

        return modelMapper.map(savedPart, PartDTO.class);
    }

    @Override
    public List<PartDTO> getAllParts() {
        List<Part> partList = partRepository.findAll();
        log.info("Part list retrieved.");

        return partList.stream()
                .map(part -> modelMapper.map(part, PartDTO.class))
                .toList();
    }
}
