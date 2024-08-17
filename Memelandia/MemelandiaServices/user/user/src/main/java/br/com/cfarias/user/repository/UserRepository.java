package br.com.cfarias.user.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.cfarias.user.entity.Users;

public interface UserRepository extends CrudRepository<Users, Long> {

}
