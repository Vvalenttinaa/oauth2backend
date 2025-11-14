package com.example.oauth2backend.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;

@Configuration
@EnableMethodSecurity(prePostEnabled = true)
public class MethodSecurityConfig {
    // Nije potreban dodatni kod — samo ova anotacija aktivira @PreAuthorize, @PostAuthorize, itd.
}