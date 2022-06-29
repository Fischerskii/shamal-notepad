package ru.fischerski.shamalnotepad.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.fischerski.shamalnotepad.db.dao.Space;

import java.util.Optional;

@Repository
public interface SpaceRepository extends CrudRepository<Space, Long> {

    Optional<Space> findBySpaceName(String spaceName);
}
