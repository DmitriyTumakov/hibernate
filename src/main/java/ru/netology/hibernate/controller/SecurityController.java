package ru.netology.hibernate.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class SecurityController {
    @Secured("ROLE_READ")
    @GetMapping("/read")
    public String read() {
        return "read";
    }

    @RolesAllowed("ROLE_WRITE")
    @PostMapping("/write")
    public String write() {
        return "write";
    }

    @PreAuthorize("hasAnyRole('ROLE_DELETE', 'ROLE_WRITE')")
    @DeleteMapping("/delete")
    public String delete() {
        return "delete";
    }

    @PostAuthorize("#username == authentication.principal.username")
    @GetMapping("/username")
    public String username(@RequestParam("username") String username) {
        return username;
    }
}
