package com.rocket_team.space_adventure.controllers;

import com.rocket_team.space_adventure.models.Chassis;
import com.rocket_team.space_adventure.services.chassis.ChassisService;
import com.rocket_team.space_adventure.utils.enums.ChassisType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/chassis")
public class ChassisController {

    private final ChassisService chassisService;

    public ChassisController(ChassisService chassisService) {
        this.chassisService = chassisService;
    }

    @PostMapping
    public ResponseEntity<Chassis> createChassis (@RequestBody ChassisType chassisType){
//        <<<<<only for testing, in Postman: Post, in body "LIGHT" or "MEDIUM" or "HEAVY"
        return ResponseEntity.ok(chassisService.createChassis(chassisType));
    }
}
