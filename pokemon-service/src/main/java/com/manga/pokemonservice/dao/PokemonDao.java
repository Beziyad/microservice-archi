package com.manga.pokemonservice.dao;

import com.manga.pokemonservice.model.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PokemonDao extends JpaRepository<Pokemon,Integer> {

}
