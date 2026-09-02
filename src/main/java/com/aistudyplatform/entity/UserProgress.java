package com.aistudyplatform.entity;

import jakarta.persistence.*;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * User Progress Entity - Tracks user progress on study materials
 */
@Entity
@Table(name = "user_progress", indexes = {
    @Index(name = "idx_user_id", columnList = "user_id"),
    @Index(name = "idx_material_id", columnList = "material_id")
},
uniqueConstraints = @UniqueConstraint(name = "uk_user_material", columnNames = {"user_id", "material_id"}))
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserProgress {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "material_id", nullable = false)
    private StudyMaterial material;

    @Column(precision = 5, scale = 2)
    @Builder.Default
    private BigDecimal completionPercentage = BigDecimal.ZERO;

    @Builder.Default
    @Column(nullable = false)
    private Integer totalQuestions = 0;

    @Builder.Default
    @Column(nullable = false)
    private Integer correctAnswers = 0;

    @Builder.Default
    @Column(nullable = false)
    private Integer studySessions = 0;

    private LocalDateTime lastStudiedAt;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(nullable = false)
    private LocalDateTime updatedAt;
}
