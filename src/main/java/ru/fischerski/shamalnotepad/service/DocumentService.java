package ru.fischerski.shamalnotepad.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fischerski.shamalnotepad.db.dao.Document;
import ru.fischerski.shamalnotepad.db.dao.enums.Mode;
import ru.fischerski.shamalnotepad.db.repository.DocumentRepository;

@Service
public class DocumentService {

    private final DocumentRepository documentRepository;

    @Autowired
    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Transactional
    public void addDocument(Document document) {
        document.setTitle("First title");
        document.setNote("First node");
        document.setMode(Mode.NOTE);
        documentRepository.save(document);
    }
}
