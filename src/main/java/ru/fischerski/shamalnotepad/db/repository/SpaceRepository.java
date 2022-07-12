package ru.fischerski.shamalnotepad.db.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.fischerski.shamalnotepad.db.dao.Space;

import java.util.List;
import java.util.Optional;

@Repository
//@EnableJpaRepositories("ru.fischerski.shamalnotepad.db.repository")
public interface SpaceRepository extends CrudRepository<Space, Long> {

    Optional<Space> findBySpaceName(String spaceName);

    @Query("SELECT space_name FROM space")
    List<String> getAllSpaceName();
}