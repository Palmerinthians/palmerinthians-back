package com.br.palmeirinthians.api;

import com.br.palmeirinthians.services.TimesService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("generic-ep")
public class TimesEP {

    private final TimesService service;

    public TimesEP(TimesService service) {
        this.service = service;
    }

    @GetMapping()
    public ResponseEntity getAll(@RequestBody String name) {
        return ResponseEntity.ok().build();
    }
}
