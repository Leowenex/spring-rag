package fr.efrei.rag.repository.dto;

/**
 * A DTO representing a document's metadata.
 * The content is not included to limit the load of the response.
 */
public record DocumentDTO(Long id, String title, String description, String author, String publisher, String publishedDate, String contentType) {
}
