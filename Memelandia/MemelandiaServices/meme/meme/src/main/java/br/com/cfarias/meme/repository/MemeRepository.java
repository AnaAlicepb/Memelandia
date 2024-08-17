package br.com.cfarias.meme.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cfarias.meme.entity.Meme;

public interface MemeRepository extends CrudRepository<Meme, Long> {

}
