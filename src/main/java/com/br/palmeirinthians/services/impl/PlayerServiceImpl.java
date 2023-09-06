package com.br.palmeirinthians.services.impl;

//import com.br.palmeirinthians.mapper.PlayerMapper;
import com.br.palmeirinthians.model.dto.PlayerDto;
import com.br.palmeirinthians.repositories.PlayerRepository;
import com.br.palmeirinthians.services.PlayerService;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class PlayerServiceImpl implements PlayerService {

    private static final Logger LOGGER = LoggerFactory.getLogger( PlayerServiceImpl.class );

    private PlayerRepository repository;

    //private PlayerMapper mapper;

    @Autowired
    public PlayerServiceImpl( PlayerRepository repository) {
        //this.mapper = mapper;
        this.repository = repository;
    }



    @Override
    public List<PlayerDto> getAll( )
    {
        LOGGER.debug( "Obtendo players" );

//        return repository.findAll( )
//                .stream( )
//                .map( mapper::asPlayerDto )
//                .collect( Collectors.toList( ) );
        return null;
    }

    @Override
    public Optional<PlayerDto> getById(Long id )
    {
        LOGGER.debug( "Obtendo player pelo id" );

//        return repository.findById( id )
//                .map( mapper::asPlayerDto );
        return null;
    }
}
