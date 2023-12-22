package com.rocket_team.space_adventure.controllers;

import com.rocket_team.space_adventure.models.dtos.PartDTO;
import com.rocket_team.space_adventure.services.part.PartService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/parts")
public class PartController {

    private final PartService partService;

    public PartController(PartService partService) {
        this.partService = partService;
    }

    @PostMapping
    public ResponseEntity<PartDTO> create
}
