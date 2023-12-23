package com.rocket_team.space_adventure.models.entities.part;

import com.rocket_team.space_adventure.utils.enums.PartType;
import jakarta.persistence.Entity;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class PartCone extends Part{

//    To do: Add for each party type a special attribute/ power.
//    private String coneSpecilPower;

    public PartCone() {
        super.partType = PartType.TYPE_CONE;
    }
}
