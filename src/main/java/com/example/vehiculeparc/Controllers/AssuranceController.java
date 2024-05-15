package com.example.vehiculeparc.Controllers;
import com.example.vehiculeparc.entities.Assurance;
import com.example.vehiculeparc.entities.Vehicule;
import com.example.vehiculeparc.services.AssuranceService;
import com.example.vehiculeparc.services.VehiculeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@AllArgsConstructor
public class AssuranceController {
    private AssuranceService assuranceService;
    private VehiculeService vehiculeService;
    @RequestMapping("/createAssurance")
    public String createAssurance(ModelMap model) {
        model.addAttribute("assurance", new Assurance());
        return "/CreateAssurance";
    }
    @RequestMapping("saveAssurance")
    public String saveAssurance(@ModelAttribute("assurance") Assurance assurance) {
        Assurance saveAssurance = assuranceService.saveAssurance(assurance);
        return "/CreateAssurance";
    }
    @RequestMapping("/createAssuranceForm")
    public String showCreateAssuranceForm(Model model) {
        model.addAttribute("assurance", new Assurance());


        List<Vehicule> vehicules = vehiculeService.getAllVehicules();
        model.addAttribute("vehicules", vehicules);

        return "createAssuranceForm";
    }
}
