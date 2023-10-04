package com.espritcs.station_de_ski.services;

import com.espritcs.station_de_ski.entities.Cours;
import com.espritcs.station_de_ski.entities.Skieur;

import java.util.List;

public interface ICoursService {
    public Cours add(Cours cours);
    public void deleteOne(Long courId);
    public Cours updateOne(Cours cours);
    public Cours getOne(Long courId);
    public List<Cours> getAll();
}
