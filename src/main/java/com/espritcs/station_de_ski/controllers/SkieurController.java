package com.espritcs.station_de_ski.controllers;

import com.espritcs.station_de_ski.entities.Skieur;
import com.espritcs.station_de_ski.services.ISkieurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SkieurController {

   @Autowired
   private ISkieurService skieurService;

   @PostMapping()
   public Skieur addSkieur(@RequestBody Skieur skieur){
      return skieurService.addSkieur(skieur);
   }
}
