package com.example.vehiculeparc.Controllers;
import com.example.vehiculeparc.entities.Controletechnique;
import com.example.vehiculeparc.entities.Vehicule;
import com.example.vehiculeparc.services.ControletechniqueService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@AllArgsConstructor
public class ControleTechniqueController {
    private ControletechniqueService controletechniqueService;

    @RequestMapping("/createControleTechnique")
    public String createControleTechnique(ModelMap model) {
        model.addAttribute("controletechnique", new Controletechnique());
        return "/CreateControleTechnique";
    }


    @RequestMapping("saveControleTechnique")
    public String saveControleTechnique(@ModelAttribute("controletechnique") Controletechnique controletechnique) {
        Controletechnique savesaveControleTechniqueVehicule = controletechniqueService.saveControletechnique(controletechnique);
        return "/CreateControleTechnique";
    }
    @RequestMapping("/controleTechniqueList")
    public String controleTechniqueList(ModelMap modelMap){
        List<Controletechnique> controletechniques = controletechniqueService.getAllControletechniques();
        modelMap.addAttribute("controletechniques", controletechniques);
        return "ControleTechniqueList";
    }
}