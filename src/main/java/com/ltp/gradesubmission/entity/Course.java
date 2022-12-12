package com.ltp.gradesubmission.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "course")
@Setter
@Getter
@RequiredArgsConstructor
@NoArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;

    @NonNull
    @Column(name = "subject", nullable = false)
    private String subject;

    @NonNull
    @Column(name = "code", nullable = false)
    private String code;

    @NonNull
    @Column(name = "description", nullable = false)
    private String description;



}