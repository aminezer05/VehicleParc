package com.example.vehiculeparc.Controllers;

import com.example.vehiculeparc.entities.Maintenance;
import com.example.vehiculeparc.entities.Reparation;
import com.example.vehiculeparc.services.ReparationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class ReparationController {

    private final ReparationService reparationService;

    @Autowired
    public ReparationController(ReparationService reparationService) {
        this.reparationService = reparationService;
    }

    @RequestMapping("/createReparation")
    public String createReparation(Model model) {
        model.addAttribute("reparation", new Reparation());
        return "CreateReparation";
    }

    @RequestMapping("/saveReparation")
    public String saveReparation(Reparation reparation) {
        reparationService.saveReparation(reparation);
        return "redirect:/createReparation";
    }
    @RequestMapping("/reparationsList")
    public String reparationsList(ModelMap modelMap){
        List<Reparation> reparations = reparationService.getAllReparations();
        modelMap.addAttribute("reparation", reparations);
        return "/ReparationsList";
    }
}
