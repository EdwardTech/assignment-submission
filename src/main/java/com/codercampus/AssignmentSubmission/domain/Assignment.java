package com.codercampus.AssignmentSubmission.domain;

import javax.persistence.*;

@Entity
public class Assignment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String status;
    private String githubUrl;
    private String branch;
    private String codeReviewVideoUrl;
    @ManyToOne(optional = false)
    private User user;

    // todo: create field - private User assignedTo;

}
