package com.rocket_team.space_adventure.models.entities.part;

import com.rocket_team.space_adventure.models.entities.Rocket;
import com.rocket_team.space_adventure.utils.enums.PartType;
import lombok.Data;

@Data
abstract class Part {

    protected Long id;

    protected String name;

    protected String description;

    protected PartType partType;

    protected Rocket rocket;

    protected int speed;

    protected int shield;

    protected int fuel;
}
