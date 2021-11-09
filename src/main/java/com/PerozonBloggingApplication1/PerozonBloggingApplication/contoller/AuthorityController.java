package com.PerozonBloggingApplication1.PerozonBloggingApplication.contoller;

import com.PerozonBloggingApplication1.PerozonBloggingApplication.service.AuthorityService;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorityController {
    private final AuthorityService authorityService;

    public AuthorityController(AuthorityService authorityService) {
        this.authorityService = authorityService;
    }
}
