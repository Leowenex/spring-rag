package fr.efrei.rag.repository;

import fr.efrei.rag.domain.Document;
import fr.efrei.rag.repository.dto.DocumentDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DocumentRepository extends JpaRepository<Document, Long> {

    @Query("""
        SELECT new fr.efrei.rag.repository.dto.DocumentDTO(d.id, d.title, d.description, d.author, d.publisher, d.publishedDate, d.contentType)
        FROM Document d
    """
    )
    List<DocumentDTO> findAllDocumentsDTO();
}
