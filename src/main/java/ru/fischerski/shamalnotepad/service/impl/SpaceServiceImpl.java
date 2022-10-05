package ru.fischerski.shamalnotepad.service.impl;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fischerski.shamalnotepad.db.dao.Space;
import ru.fischerski.shamalnotepad.db.repository.SpaceRepository;
import ru.fischerski.shamalnotepad.service.SpaceService;

import java.util.List;

@Slf4j
@Service("spaceService")
public class SpaceServiceImpl implements SpaceService {

    private final SpaceRepository spaceRepository;

    @Autowired
    public SpaceServiceImpl(SpaceRepository spaceRepository) {
        this.spaceRepository = spaceRepository;
    }

    @Override
    @Transactional
    public void createSpace(Space space) {
        spaceRepository.save(space);
    }

    @Override
    @Transactional
    public List<String> findAllSpaceName() {
        List<String> allSpaceNames;
        allSpaceNames = spaceRepository.getAllSpaceName();
        return allSpaceNames;
    }
}
