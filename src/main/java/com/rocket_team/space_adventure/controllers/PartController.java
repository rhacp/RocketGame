package com.rocket_team.space_adventure.controllers;

import com.rocket_team.space_adventure.models.dtos.PartDTO;
import com.rocket_team.space_adventure.services.part.PartService;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/parts")
public class PartController {

    private final PartService partService;

    public PartController(PartService partService) {
        this.partService = partService;
    }

    @PostMapping
    public ResponseEntity<PartDTO> createPart(@Valid @RequestBody PartDTO partDTO) {
        return  ResponseEntity.ok(partService.createPart(partDTO));
    }

    @GetMapping
    public ResponseEntity<List<PartDTO>> getAllParts() {
        return ResponseEntity.ok(partService.getAllParts());
    }
}
