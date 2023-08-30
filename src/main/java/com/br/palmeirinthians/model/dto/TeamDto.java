package com.br.palmeirinthians.model.dto;

import com.br.palmeirinthians.model.entity.LeagueEntity;
import com.br.palmeirinthians.model.entity.PlayerEntity;

import java.util.List;

public record TeamDto(
        Long teamCode,
        String name,
        List<LeagueEntity> leagues,
        List<PlayerEntity> players ) { }
