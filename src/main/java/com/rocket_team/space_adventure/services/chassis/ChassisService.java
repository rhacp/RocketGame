package com.rocket_team.space_adventure.services.chassis;

import com.rocket_team.space_adventure.models.Chassis;
import com.rocket_team.space_adventure.utils.enums.ChassisType;

public interface ChassisService {

    Chassis createChassis(ChassisType chassisType);
}
