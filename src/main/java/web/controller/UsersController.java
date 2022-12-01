package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.model.User;
import web.service.UserServiceImp;


@Controller
@RequestMapping("/users")
public class UsersController {
    private final UserServiceImp userServiceImp;

    @Autowired
    public UsersController(UserServiceImp userServiceImp) {
        this.userServiceImp = userServiceImp;
    }

    /*@GetMapping() //получаем всех людей из дао и передаём на отображение в представлении
    public String index(Model model) {
        model.addAttribute("users", userServiceImp.index());
        return "friends/index";
    }

    @GetMapping("/{id}") //для получения человека по id из дао и передаём на отображение в представлении
    public String show(@PathVariable("id") Long id, Model model) {
        model.addAttribute("friends", userServiceImp.show(id));
        return "friends/show";
    }

    @GetMapping("friends/new")
    public String newUser(Model model) {
        model.addAttribute("friends", new User());
        return "friends/new";
    }

    @PostMapping()
    public String create(@ModelAttribute("friends") User user) {
        userServiceImp.save(user);
        return "redirect:/friends"; // редирект?
    }*/

}