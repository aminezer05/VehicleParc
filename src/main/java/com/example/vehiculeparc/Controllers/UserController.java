package com.example.vehiculeparc.Controllers;

import com.example.vehiculeparc.entities.User;
import com.example.vehiculeparc.services.UserService;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@AllArgsConstructor
public class UserController {

    private final UserService userService;

    @RequestMapping("/createUser")
    public String createUser(ModelMap model) {
        model.addAttribute("user", new User());
        return "CreateUser";
    }

    @RequestMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/createUser";
    }

    @RequestMapping("/usersList")
    public String usersList(ModelMap modelMap,
                            @RequestParam(name = "page", defaultValue = "0") int page,
                            @RequestParam(name = "size", defaultValue = "3") int size) {
        Page<User> usersVue = userService.getAllUsersByPage(page, size);

        if (usersVue == null || usersVue.isEmpty()) {
            usersVue = Page.empty();
        }

        modelMap.addAttribute("usersVue", usersVue);
        modelMap.addAttribute("currentPage", page);
        modelMap.addAttribute("pages", new int[usersVue.getTotalPages()]);

        return "UsersList";
    }


}
