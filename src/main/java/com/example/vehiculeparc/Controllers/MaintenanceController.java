package com.example.vehiculeparc.Controllers;

import com.example.vehiculeparc.entities.Maintenance;
import com.example.vehiculeparc.services.MaintenanceService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class MaintenanceController {

    private final MaintenanceService maintenanceService;

    @RequestMapping("/createMaintenance")
    public String createMaintenance(ModelMap model) {
        model.addAttribute("maintenance", new Maintenance());
        return "/CreateMaintenance";
    }

    @RequestMapping("saveMaintenance")
    public String saveMaintenance(@ModelAttribute("maintenance") Maintenance maintenance) {
        Maintenance savedMaintenance = maintenanceService.saveMaintenance(maintenance);
        return "/CreateMaintenance";
    }

    @RequestMapping("/maintenancesList")
    public String maintenanceList(ModelMap modelMap){
        List<Maintenance> maintenances = maintenanceService.getAllMaintenances();
        modelMap.addAttribute("maintenance", maintenances);
        return "/MaintenancesList";
    }
}
