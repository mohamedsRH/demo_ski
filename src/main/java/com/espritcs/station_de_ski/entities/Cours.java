package com.espritcs.station_de_ski.entities;

import com.espritcs.station_de_ski.entities.enums.Support;
import com.espritcs.station_de_ski.entities.enums.TypeCours;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
public class Cours {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private int niveau;
    @Enumerated(EnumType.STRING)
    private TypeCours typeCours;
    @Enumerated(EnumType.STRING)
    private Support support;
    private float prix;
    private int creneau;

    @OneToMany(mappedBy = "cours")
    Set<Inscription> inscriptions;

}
