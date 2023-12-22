package com.rocket_team.space_adventure.factories;

import com.rocket_team.space_adventure.models.Chassis;
import com.rocket_team.space_adventure.utils.enums.ChassisType;

public class ChassisFactory {

    public static Chassis createChassis(ChassisType chassisType) {
        switch (chassisType) {
            case LIGHT:
                return new Chassis(3, 1, 2);
            case MEDIUM:
                return new Chassis(2, 2, 2);
            case HEAVY:
                return new Chassis(1, 1, 4);
            default:
                throw new IllegalArgumentException("Invalid chassis type");
        }
    }
}
