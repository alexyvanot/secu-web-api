package fr.alexyvanot.secuwebapi.sql;

import org.springframework.data.repository.CrudRepository;

import fr.alexyvanot.secuwebapi.core.User;

public interface UserRepo extends CrudRepository<User, Integer> {}
