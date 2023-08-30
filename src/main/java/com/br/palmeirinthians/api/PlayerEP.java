package com.br.palmeirinthians.api;

import com.br.palmeirinthians.model.dto.PlayerDto;
import com.br.palmeirinthians.services.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController("players")
public class PlayerEP {

    private final PlayerService playerService;

    @Autowired
    public PlayerEP(PlayerService playerService) {
        this.playerService = playerService;
    }

    @GetMapping
    public ResponseEntity<PlayerDto> getAll( )
    {
        List<PlayerDto> teams = playerService.getAll( );
        return ResponseEntity.ok( )
                .header("Access-Control-Allow-Origin")
                .build( );
    }

    @GetMapping("id")
    public ResponseEntity<PlayerDto> getById( Long id )
    {
        Optional<PlayerDto> teams = playerService.getById( id );
        return ResponseEntity.ok( )
                .header("Access-Control-Allow-Origin")
                .build( );
    }
}
