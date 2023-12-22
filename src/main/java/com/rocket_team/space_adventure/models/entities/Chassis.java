package com.rocket_team.space_adventure.models.entities;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table (name = "chassis")
public class Chassis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int speed;
    private int shield;
    private int fuel;
}
