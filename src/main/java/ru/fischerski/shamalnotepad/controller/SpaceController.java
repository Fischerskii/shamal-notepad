package ru.fischerski.shamalnotepad.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ru.fischerski.shamalnotepad.db.dao.Space;
import ru.fischerski.shamalnotepad.db.repository.SpaceRepository;
import ru.fischerski.shamalnotepad.service.SpaceService;

@Slf4j
@Controller
@RequestMapping("/shamal/space")
public class SpaceController {

    private final SpaceService spaceService;
    private final SpaceRepository spaceRepository;

    @Autowired
    public SpaceController(SpaceService spaceService, SpaceRepository spaceRepository) {
        this.spaceService = spaceService;
        this.spaceRepository = spaceRepository;
    }

    @GetMapping("/create")
    public String createSpacePage(Model model) {

        model.addAttribute("spaces", spaceRepository.getAllSpaceName());
        log.info(String.valueOf(spaceRepository.getAllSpaceName()));
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
