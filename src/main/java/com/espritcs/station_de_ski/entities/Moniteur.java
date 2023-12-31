package com.espritcs.station_de_ski.entities;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Setter
@Getter
@Entity
public class Moniteur {
    @Id
    @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nomM;
    private String prenomM;
    @Temporal(TemporalType.DATE)
    private LocalDate dateRecru;

    @OneToMany
    Set<Cours> cours;

}
