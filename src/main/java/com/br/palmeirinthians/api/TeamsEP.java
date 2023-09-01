package com.br.palmeirinthians.api;

import com.br.palmeirinthians.model.dto.TeamDto;
import com.br.palmeirinthians.services.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("teams")
public class TeamsEP {

    @Autowired
    private TeamService teamService;

    @GetMapping()
    public ResponseEntity<TeamDto> getAll( )
    {
        List<TeamDto> teams = teamService.getAll( );
        return ResponseEntity.ok( )
                .header("Access-Control-Allow-Origin")
                .build( );
    }
}
