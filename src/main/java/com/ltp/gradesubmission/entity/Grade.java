package com.ltp.gradesubmission.entity;

import lombok.*;

import javax.persistence.*;
import javax.websocket.server.ServerEndpoint;

@Entity
@Table(name="grade")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Grade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id")
    private Long id;
    @Column(name="score", nullable = false)
    private String score;
    @ManyToOne(optional = false)
    @JoinColumn(name = "student_id", referencedColumnName = "id")
    private Student student;

}
