package ru.fischerski.shamalnotepad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fischerski.shamalnotepad.db.dao.Space;
import ru.fischerski.shamalnotepad.db.repository.SpaceRepository;

@Service
public class SpaceService {

    private final SpaceRepository spaceRepository;

    @Autowired
    public SpaceService(SpaceRepository spaceRepository) {
        this.spaceRepository = spaceRepository;
    }

    @Transactional
    public void addSpace(Space space) {
        space.setSpaceName("First space");
        space.setEditors("First editor");
        space.setViewers("First viewer");
        spaceRepository.save(space);
    }
}
