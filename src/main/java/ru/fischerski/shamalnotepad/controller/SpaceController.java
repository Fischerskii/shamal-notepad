package ru.fischerski.shamalnotepad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.fischerski.shamalnotepad.db.dao.Space;
import ru.fischerski.shamalnotepad.service.SpaceService;

@Controller
@RequestMapping("/shamal/space")
public class SpaceController {

    private final SpaceService spaceService;

    @Autowired
    public SpaceController(SpaceService spaceService) {
        this.spaceService = spaceService;
    }

    @GetMapping("/create")
    public String createSpacePage(@ModelAttribute("space") Space space) {
        return "/space/startPage";
    }

    @PostMapping("/create")
    public String createNewSpace(@ModelAttribute("space") Space space,
                                 BindingResult bindingResult) {

        if (bindingResult.hasErrors()) {
            return "/space/startPage";
        }

        spaceService.addSpace(space);
        return "redirect:/space/inSpace";
    }
}
