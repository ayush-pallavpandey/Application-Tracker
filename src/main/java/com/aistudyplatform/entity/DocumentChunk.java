package com.aistudyplatform.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;

/**
 * Document Chunk Entity - Represents chunks of processed documents
 */
@Entity
@Table(name = "document_chunks", indexes = {
    @Index(name = "idx_material_id", columnList = "material_id"),
    @Index(name = "idx_embedding_id", columnList = "embedding_id")
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class DocumentChunk {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "material_id", nullable = false)
    private StudyMaterial material;

    @Column(nullable = false)
    private Integer chunkNumber;

    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String content;

    @Column(length = 255)
    private String embeddingId; // ID from vector DB (e.g., Pinecone)

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @PrePersist
    protected void onCreate() {
        if (createdAt == null) {
            createdAt = LocalDateTime.now();
        }
    }
}
