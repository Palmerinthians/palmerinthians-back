package com.br.palmeirinthians.repositories;

import com.br.palmeirinthians.model.dto.TeamDto;
import com.br.palmeirinthians.model.entity.TeamEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TeamRepository extends JpaRepository<TeamEntity, Long> {
}
