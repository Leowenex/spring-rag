package fr.efrei.rag.service;

import fr.efrei.rag.domain.Document;
import fr.efrei.rag.repository.DocumentRepository;
import fr.efrei.rag.repository.dto.DocumentDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentService {

    private final Logger log = LoggerFactory.getLogger(DocumentService.class);

    private final DocumentRepository documentRepository;

    public DocumentService(DocumentRepository documentRepository) {
        this.documentRepository = documentRepository;
    }

    public Document buildAndSave(Document document) {
        log.debug("Request to save Document : {}", document);
        return documentRepository.save(document);
    }

    public List<Document> findAll() {
        log.debug("Request to find all Documents");
        return documentRepository.findAll();
    }

    public List<DocumentDTO> findAllDTO() {
        log.debug("Request to find all Documents DTO");
        return documentRepository.findAllDocumentsDTO();
    }

    public Optional<Document> findById(Long id) {
        log.debug("Request to get Document : {}", id);
        return documentRepository.findById(id);
    }

}
