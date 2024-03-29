package ru.fischerski.shamalnotepad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import ru.fischerski.shamalnotepad.db.dao.Person;
import ru.fischerski.shamalnotepad.service.impl.RegistrationServiceImpl;
import ru.fischerski.shamalnotepad.validator.PersonValidator;

import javax.validation.Valid;

@Controller
@RequestMapping("/auth")
public class AuthController {

    private final RegistrationServiceImpl registrationService;
    private final PersonValidator personValidator;

    @Autowired
    public AuthController(RegistrationServiceImpl registrationService, PersonValidator personValidator) {
        this.registrationService = registrationService;
        this.personValidator = personValidator;
    }

    @GetMapping("/login")
    public String loginPage() {
        return "auth/login";
    }

    @GetMapping("/registration")
    public String registrationPage(@ModelAttribute("person") Person person) {
        return "auth/registration";
    }

    @PostMapping("/registration")
    public String performRegistration(@ModelAttribute("person") @Valid Person person,
                                        BindingResult bindingResult) {
        personValidator.validate(person, bindingResult);

        if (bindingResult.hasErrors()) {
            return "/auth/registration";
        }

        registrationService.register(person);

        return "redirect:/auth/login"; // TODO add new page with sending confirmation code to email after registration
    }

    @PostMapping("/login")
    public String performAuthorization(@ModelAttribute("person") @Valid Person person, BindingResult bindingResult) {

        personValidator.validate(person, bindingResult);

        if (bindingResult.hasErrors()) {
            return "/auth/login";
        }

        return "redirect:/space/startPage";
    }
}