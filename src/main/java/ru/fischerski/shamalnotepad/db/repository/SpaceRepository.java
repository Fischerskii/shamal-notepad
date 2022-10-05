package ru.fischerski.shamalnotepad.db.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.fischerski.shamalnotepad.db.dao.Space;

import java.util.List;

@Repository
public interface SpaceRepository extends CrudRepository<Space, Long> {

    String findBySpaceName(String spaceName);

    @Query(value = "SELECT space_name FROM space", nativeQuery = true)
    List<String> getAllSpaceName();

}