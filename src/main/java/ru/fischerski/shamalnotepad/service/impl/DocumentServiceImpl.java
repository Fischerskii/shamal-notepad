package ru.fischerski.shamalnotepad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ru.fischerski.shamalnotepad.db.dao.Document;
import ru.fischerski.shamalnotepad.db.dao.enums.Mode;
import ru.fischerski.shamalnotepad.db.repository.DocumentRepository;
import ru.fischerski.shamalnotepad.service.DocumentService;

@Service
public class DocumentServiceImpl implements DocumentService {

    private final DocumentRepository documentRepository;

    @Autowired
    public DocumentServiceImpl(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    @Transactional
    public void addDocument(Document document) {
        /*document.setTitle("First title");
        document.setNote("First node");
        document.setMode(Mode.NOTE);*/
        documentRepository.save(document);
    }
}
