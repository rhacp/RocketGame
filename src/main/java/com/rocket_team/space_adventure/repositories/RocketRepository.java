package com.rocket_team.space_adventure.repositories;

import com.rocket_team.space_adventure.models.entities.Rocket;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RocketRepository extends JpaRepository<Rocket, Long> {

}
