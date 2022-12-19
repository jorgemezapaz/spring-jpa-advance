package com.like.a.shark.springjsadvance.repository;

import com.like.a.shark.springjsadvance.domain.Client;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends CrudRepository<Client, Long> {
}
