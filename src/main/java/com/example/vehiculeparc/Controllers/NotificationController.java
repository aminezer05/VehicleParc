/*package com.example.vehiculeparc.controllers;

import com.example.vehiculeparc.entities.Notification;
import com.example.vehiculeparc.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NotificationController {

    @Autowired
    private NotificationService notificationService;

    @GetMapping("/envoyer-message")
    public String afficherFormulaire() {
        return "envoyer_message";
    }

    @PostMapping("/envoyer-message")
    public String envoyerMessage(@RequestParam("message") String message,
                                 @RequestParam("phoneNumber") String phoneNumber,
                                 Model model) {
        Notification notification = new Notification();
        notification.setMessage(message);
        notification.setPhoneNumber(phoneNumber);

        // Enregistrement de la notification dans la base de données ou envoi du message
        notificationService.envoyerNotification(notification);

        model.addAttribute("messageEnvoye", true);
        return "envoyer_message";
    }
}*/
