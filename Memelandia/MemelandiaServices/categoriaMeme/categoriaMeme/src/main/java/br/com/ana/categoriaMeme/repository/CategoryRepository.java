package br.com.ana.categoriaMeme.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.ana.categoriaMeme.entity.CategoryMeme;


public interface CategoryRepository extends CrudRepository<CategoryMeme, Long> {

}
