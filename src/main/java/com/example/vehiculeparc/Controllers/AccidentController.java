package com.example.vehiculeparc.Controllers;
import com.example.vehiculeparc.entities.Accident;
import com.example.vehiculeparc.entities.Controletechnique;
import com.example.vehiculeparc.entities.Vehicule;
import com.example.vehiculeparc.services.AccidentService;
import com.example.vehiculeparc.services.VehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class AccidentController {
    private AccidentService accidentService;
    private VehiculeService vehiculeService;

    @RequestMapping ("/createAccident")
    public String showCreateAccidentForm(Model model) {
        model.addAttribute("accident", new Accident());

        List<Vehicule> vehicules = vehiculeService.getAllVehicules();

        model.addAttribute("vehicules", vehicules);

        return "CreateAccident";
    }

    @RequestMapping("/saveAccident")
    public String saveAccident(@ModelAttribute("accident") Accident accident) {
        accidentService.saveAccident(accident);
        return "/CreateAccident";
    }
    @RequestMapping("/accidentList")
    public String accidentList(Model model){
        List<Accident> accidents = accidentService.getAllAccidents();
        model.addAttribute("accidents", accidents);
        return "/AccidentList";
    }
}


