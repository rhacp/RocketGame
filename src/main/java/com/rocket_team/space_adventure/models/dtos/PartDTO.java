package com.rocket_team.space_adventure.models.dtos;

import com.rocket_team.space_adventure.models.entities.Rocket;
import com.rocket_team.space_adventure.utils.enums.PartType;

public class PartDTO {

    protected Long id;

    protected String name;

    protected String description;

    protected PartType partType;

    protected Rocket rocket;

    protected int speed;

    protected int shield;

    protected int fuel;
}
