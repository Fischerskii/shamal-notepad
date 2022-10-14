package ru.fischerski.shamalnotepad.service;

import ru.fischerski.shamalnotepad.db.dao.Space;
import ru.fischerski.shamalnotepad.dto.SpaceDTO;

import java.util.List;

public interface SpaceService {

    void createSpace(Space space);

    List<String> findAllSpaceName();
}
