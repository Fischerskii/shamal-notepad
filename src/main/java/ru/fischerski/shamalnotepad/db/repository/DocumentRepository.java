package ru.fischerski.shamalnotepad.db.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.fischerski.shamalnotepad.db.dao.Document;
import ru.fischerski.shamalnotepad.db.dao.Person;

import java.util.Optional;

@Repository
public interface DocumentRepository extends CrudRepository<Document, Long> {

    Optional<Document> findByTitle(String title);
}
