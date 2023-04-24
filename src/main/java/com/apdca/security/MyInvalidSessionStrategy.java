package com.apdca.security;

import java.io.IOException;

import org.springframework.security.web.session.InvalidSessionStrategy;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class MyInvalidSessionStrategy implements InvalidSessionStrategy {

	private final String destinationUrl;

    public MyInvalidSessionStrategy(String destinationUrl) {
        this.destinationUrl = destinationUrl;
    }

    @Override
    public void onInvalidSessionDetected(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        response.sendRedirect(destinationUrl);
    }

}
