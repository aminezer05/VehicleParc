package com.example.vehiculeparc.Controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/index.html")
    public String home() {
        return "index";
    }
    @RequestMapping("/CreateControleTechnique.html")
    public String CreateControleTechnique() {
        return "CreateControleTechnique";
}
    @RequestMapping("/CreateContrat.html")
    public String CreateContrat() {
        return "CreateContrat";
    }
    @RequestMapping("/CreateAssurance.html")
    public String CreateAssurance() {
        return "CreateAssurance";
    }
    @RequestMapping("/CreateUser.html")
    public String CreateUser() {
        return "CreateUser";
    }
    @RequestMapping("/CreateVehicule.html")
    public String CreateVehicule() {
        return "CreateVehicule";
    }
    @RequestMapping("/CreateMaintenance.html")
    public String CreateMaintenance() {
        return "CreateMaintenance";
    }
    @RequestMapping("/CreateAccident.html")
    public String CreateAccident() {
        return "CreateAccident";
    }
}

