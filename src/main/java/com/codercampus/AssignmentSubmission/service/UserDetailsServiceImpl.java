package com.codercampus.AssignmentSubmission.service;

import com.codercampus.AssignmentSubmission.domain.User;
import com.codercampus.AssignmentSubmission.repository.UserRepository;
import com.codercampus.AssignmentSubmission.util.CustomPasswordEncoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    private CustomPasswordEncoder encoder;

    @Autowired
    UserRepository repository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Optional<User> userOptional = repository.findByUsername(username);

        return userOptional
                .orElseThrow(() -> new UsernameNotFoundException("Invalid credentials"));
    }
}
