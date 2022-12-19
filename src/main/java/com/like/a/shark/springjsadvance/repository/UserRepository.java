package com.like.a.shark.springjsadvance.repository;

import com.like.a.shark.springjsadvance.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}
