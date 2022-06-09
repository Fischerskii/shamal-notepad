package ru.fischerski.shamalnotepad.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.fischerski.shamalnotepad.db.dao.User;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

//    Boolean existsByLogin(String login);

    Optional<User> findByLogin(String login);
}