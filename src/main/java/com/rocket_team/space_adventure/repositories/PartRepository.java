package com.rocket_team.space_adventure.repositories;

import com.rocket_team.space_adventure.models.entities.part.Part;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PartRepository extends JpaRepository<Part, Long> {

    Part findByName(String name);
    Part findBySpeedAndShieldAndFuel(Integer speed, Integer shield, Integer fuel);
}
