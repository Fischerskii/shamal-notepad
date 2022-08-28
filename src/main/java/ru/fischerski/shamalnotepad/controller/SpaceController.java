package ru.fischerski.shamalnotepad.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
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

    @GetMapping("/selectSpace")
    public String selectPage(Model model) {
//        log.info("space name list: {}", spaceRepository.getAllSpaceName());
        model.addAttribute("spaceNames", spaceRepository.getAllSpaceName());
        return "space/selectSpace";
    }

    @GetMapping("/createSpace")
    public String viewCreateNewSpacePage(@ModelAttribute("space") Space space) {
        return "space/createSpace";
    }

    @PostMapping("/createSpace")
    public String createNewSpacePage(@ModelAttribute("space") Space space) {

        spaceService.createSpace(space);
        return "redirect:/space/createSpace";
    }
}
