package com.br.palmeirinthians.model.dto;

import com.br.palmeirinthians.model.entity.TeamEntity;

public record PlayerDto( String name, String age, TeamEntity team, String position ) {
}
