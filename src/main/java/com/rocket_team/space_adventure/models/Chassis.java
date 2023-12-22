package com.rocket_team.space_adventure.models;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Chassis {

    private Integer speed;
    private Integer shield;
    private Integer fuel;
}
