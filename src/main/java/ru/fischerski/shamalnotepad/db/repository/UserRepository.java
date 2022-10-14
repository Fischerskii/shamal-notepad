package ru.fischerski.shamalnotepad.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.fischerski.shamalnotepad.db.dao.Person;

import java.util.Optional;

@Repository
public interface UserRepository extends CrudRepository<Person, Long> {

    Optional<Person> findByLogin(String login);
}