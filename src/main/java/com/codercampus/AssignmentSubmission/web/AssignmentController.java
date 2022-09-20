package com.codercampus.AssignmentSubmission.web;

import com.codercampus.AssignmentSubmission.domain.Assignment;
import com.codercampus.AssignmentSubmission.domain.User;
import com.codercampus.AssignmentSubmission.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/assignments")
public class AssignmentController {

    @Autowired
    private AssignmentService assignmentService;

    @PostMapping("")
    public ResponseEntity<?> createAssignment(@AuthenticationPrincipal User user) {
        var assignment = assignmentService.save(user);
        return ResponseEntity.ok(assignment);
    }

    @GetMapping("")
    public ResponseEntity<?> getAssignmentsByUser(@AuthenticationPrincipal User user) {
        var assignmentsByUser = assignmentService.findByUser(user);
        return ResponseEntity.ok(assignmentsByUser);
    }

    @GetMapping("{assignmentId}")
    public ResponseEntity<?> getAssignmentById(@PathVariable Long assignmentId,
                                               @AuthenticationPrincipal User user) {
        var assignment = assignmentService.findById(assignmentId);
        return ResponseEntity.ok(assignment.get());
    }

    @PutMapping("{assignmentId}")
    public ResponseEntity<?> updateAssignment(@PathVariable Long assignmentId,
                                              @RequestBody Assignment assignment,
                                              @AuthenticationPrincipal User user) {
        var assignmentUpdated = assignmentService.update(assignment);
        return ResponseEntity.ok(assignmentUpdated);
    }
}
