package com.br.palmeirinthians.services;

import com.br.palmeirinthians.model.dto.PlayerDto;

import java.util.List;
import java.util.Optional;

public interface PlayerService {

    List<PlayerDto> getAll();

    Optional<PlayerDto> getById(Long id );
}
