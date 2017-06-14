/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mendelu.uis.weblayer.controller;

import com.mendelu.uis.daolayer.domain.Predmet;
import com.mendelu.uis.servicelayer.facade.PredmetFacade;
import java.security.Principal;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author pechal
 */
@Controller
@RequestMapping("/")
public class HomepageController {

    @Autowired
    private PredmetFacade predmetFacade;

    @RequestMapping(method = RequestMethod.GET)
    public String list(Model model, Principal principal) {
        
        //predmetFacade = new PredmetFacadeImpl();
        //TrainerDTO trainer = trainerFacade.getTrainerWithEmail(principal.getName());
        //model.addAttribute("trainer", trainer);
        //List<Predmet> badges = badgeFacade.getBadgesByTrainer(trainer.getId());
        List<Predmet> predmets = predmetFacade.getAllPredmet();
        
        //List<Predmet> predmets = new ArrayList<Predmet>()
        //Ucitel u = new Ucitel("Karel", "Ing", "Mendelu", "majl@ted.ss");
        //predmets.add(new Predmet("SW2", "Soft",5, u));
        //predmets.add(new Predmet("NSA", "Neuron",3, u));
        
        model.addAttribute("predmets", predmets);
        return "home";
    }
}