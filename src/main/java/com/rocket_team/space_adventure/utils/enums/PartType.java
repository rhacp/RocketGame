package com.rocket_team.space_adventure.utils.enums;

import lombok.Getter;

@Getter
public enum PartType {

    TYPE_CONE("Type Cone"),
    TYPE_TWO("Type Two"),
    TYPE_THREE("Type Three");

    private final String statusLabel;


    PartType(String statusLabel) {
        this.statusLabel = statusLabel;
    }
}
