package com.espritcs.station_de_ski.repositories;

import com.espritcs.station_de_ski.entities.Cours;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICoursRepository extends JpaRepository<Cours,Long> { }
