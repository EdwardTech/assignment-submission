package com.codercampus.AssignmentSubmission.service;

import com.codercampus.AssignmentSubmission.domain.Assignment;
import com.codercampus.AssignmentSubmission.domain.User;
import com.codercampus.AssignmentSubmission.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.Set;

@Service
public class AssignmentService {

    @Autowired
    private AssignmentRepository repository;

    public Assignment save(User user) {
        System.out.println("user has been saved");
        Assignment assignment = new Assignment();
        assignment.setStatus("Needs to be submitted");
        assignment.setUser(user);
        return repository.save(assignment);
    }

    public Set<Assignment> findByUser(User user) {
        return repository.findByUser(user);
    }

    public Optional <Assignment> findById(Long id) {
        return repository.findById(id);
    }

    public Assignment update(Assignment assignment) {
        return repository.save(assignment);
    }
}
