package com.example.vehiculeparc.Controllers;
import com.example.vehiculeparc.entities.User;
import com.example.vehiculeparc.entities.Vehicule;
import com.example.vehiculeparc.services.UserService;
import com.example.vehiculeparc.services.VehiculeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class VehiculeController {

    private final UserService userService;
    private final VehiculeService vehiculeService;

    @Autowired
    public VehiculeController(UserService userService, VehiculeService vehiculeService) {
        this.userService = userService;
        this.vehiculeService = vehiculeService;
    }

    @RequestMapping("/createVehicule")
    public String afficherFormulaire(Model model) {
        List<User> users = userService.getUsers();
        model.addAttribute("users", users);
        model.addAttribute("vehicule", new Vehicule());
        return "CreateVehicule";
    }

    @RequestMapping("/saveVehicule")
    public String saveVehicule(@ModelAttribute("vehicule") Vehicule vehicule) {
        vehiculeService.saveVehicule(vehicule);
        return "redirect:/vehiculesList";
    }

    @RequestMapping("/vehiculesList")
    public String vehiculesList(Model model) {
        List<Vehicule> vehicules = vehiculeService.getVehicules();
        model.addAttribute("vehicules", vehicules);
        return "VehiculesList";
    }
}
