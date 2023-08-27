package com.br.palmeirinthians.api;

import com.br.palmeirinthians.services.TeamService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("generic-ep")
public class TimesEP {

    private final TeamService service;

    public TimesEP(TeamService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity getAll(@RequestBody String name) {
        return ResponseEntity.ok().build();
    }
}
