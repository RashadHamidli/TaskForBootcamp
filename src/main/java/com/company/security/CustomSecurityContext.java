package com.company.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class CustomSecurityContext {

    public void setSecurityContext(Authentication auth) {
        SecurityContextHolder.getContext().setAuthentication(auth);
    }

    public String getSecurityContext() {
        return SecurityContextHolder.getContext().getAuthentication().getName();
    }

}
