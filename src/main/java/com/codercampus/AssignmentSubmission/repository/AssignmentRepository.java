package com.codercampus.AssignmentSubmission.repository;

import com.codercampus.AssignmentSubmission.domain.Assignment;
import com.codercampus.AssignmentSubmission.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Set;

public interface AssignmentRepository extends JpaRepository<Assignment, Long> {

    Set<Assignment> findByUser(User user);
}
