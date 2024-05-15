package com.example.vehiculeparc.Controllers;
import com.example.vehiculeparc.entities.Contrat;
import com.example.vehiculeparc.services.ContratService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@AllArgsConstructor
public class ContratController {
    @Autowired
    private ContratService contratService;

    @RequestMapping("/createContrat")
    public String afficherFormulaireCreation(Model model) {
        model.addAttribute("contrat", new Contrat());
        return "/createContrat";
    }

    @PostMapping("/contrats/save")
    public String enregistrerContrat(@ModelAttribute Contrat contrat) {
        contratService.saveContrat(contrat);
        return "/createContrat";
    }
}
