package com.br.palmeirinthians.services;

import com.br.palmeirinthians.model.dto.TeamDto;
import com.br.palmeirinthians.model.entity.TeamEntity;

import java.util.List;

public interface TeamService {

    List<TeamDto> getAll();

}
