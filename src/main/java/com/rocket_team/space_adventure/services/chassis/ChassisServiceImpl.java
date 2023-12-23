package com.rocket_team.space_adventure.services.chassis;

import com.rocket_team.space_adventure.factories.ChassisFactory;
import com.rocket_team.space_adventure.models.Chassis;
import com.rocket_team.space_adventure.utils.enums.ChassisType;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class ChassisServiceImpl implements ChassisService{

    @Override
    public Chassis createChassis(ChassisType chassisType) {
        log.info("Created chassis type {}", chassisType);
        return ChassisFactory.createChassis(chassisType);
    }
}
