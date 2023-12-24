package com.rocket_team.space_adventure.models.entities.part;

import com.rocket_team.space_adventure.utils.enums.PartType;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "parts")
public abstract class Part {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    protected Long id;

    @Column(name = "name")
    protected String name;

    @Column(name = "description")
    protected String description;

    @Column(name = "rocket")
    protected String rocket;

    @Column(name = "part_type")
    protected PartType partType;

    @Column(name = "speed")
    protected Integer speed;

    @Column(name = "shield")
    protected Integer shield;

    @Column(name = "fuel")
    protected Integer fuel;
}
