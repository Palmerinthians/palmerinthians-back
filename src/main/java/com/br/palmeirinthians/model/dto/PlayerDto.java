package com.br.palmeirinthians.model.dto;

import com.br.palmeirinthians.model.entity.TeamEntity;

public record PlayerDto(
        Long playerCode,
        String name,
        String age,
        TeamEntity team,
        String position ) { }
