package com.espritcs.station_de_ski.services;

import com.espritcs.station_de_ski.entities.Cours;
import com.espritcs.station_de_ski.repositories.ICoursRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ICoursServiceImpl implements ICoursService {
    private final ICoursRepository coursRepository;

    @Override
    public Cours add(Cours cours) {
        return coursRepository.save(cours);
    }

    @Override
    public void deleteOne(Long courId) {
        coursRepository.deleteById(courId);
    }

    @Override
    public Cours updateOne(Cours cours) {
        Assert.notNull(cours.getId(),"Must not be null");
        return coursRepository.save(cours);
    }

    @Override
    public Cours getOne(Long courId) {
        return coursRepository.findById(courId).orElse(null);
    }

    @Override
    public List<Cours> getAll() {
        return coursRepository.findAll();
    }
}
