package com.espritcs.station_de_ski.services;

import com.espritcs.station_de_ski.entities.Skieur;
import com.espritcs.station_de_ski.repositories.SkieurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ISkieurServiceImpl implements ISkieurService{

    @Autowired
    private SkieurRepository skieurRepository;
    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void deleteSkieur(Long skieurId) {
        skieurRepository.deleteById(skieurId);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur getSkieur(Long skieurId) {
        return skieurRepository.findById(skieurId).orElse(null);
    }

    @Override
    public List<Skieur> getAllSkieurs() {
        return (List<Skieur>) skieurRepository.findAll();
    }
}
