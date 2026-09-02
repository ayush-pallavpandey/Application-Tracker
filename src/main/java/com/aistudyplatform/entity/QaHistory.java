package com.aistudyplatform.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * Q&A History Entity - Stores questions, answers, and feedback
 */
@Entity
@Table(name = "qa_history", indexes = {
    @Index(name = "idx_user_id", columnList = "user_id"),
    @Index(name = "idx_material_id", columnList = "material_id"),
    @Index(name = "idx_created_at", columnList = "created_at")
})
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class QaHistory {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "material_id")
    private StudyMaterial material;

    @Column(nullable = false, columnDefinition = "TEXT")
    private String question;

    @Column(nullable = false, columnDefinition = "LONGTEXT")
    private String answer;

    @Column(precision = 3, scale = 2)
    private BigDecimal confidence;

    @Builder.Default
    @Column(nullable = false)
    private Integer helpfulCount = 0;

    @Builder.Default
    @Column(nullable = false)
    private Integer unhelpfulCount = 0;

    @Enumerated(EnumType.STRING)
    private Feedback userFeedback;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    public enum Feedback {
        HELPFUL, UNHELPFUL, NEUTRAL
    }
}
