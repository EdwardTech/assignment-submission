package com.codercampus.AssignmentSubmission;

import com.codercampus.AssignmentSubmission.AssignmentSubmissionApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(AssignmentSubmissionApplication.class);
	}

}
