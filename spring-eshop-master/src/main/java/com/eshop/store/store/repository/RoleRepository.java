package com.eshop.store.store.repository;

import org.springframework.data.repository.CrudRepository;

import com.eshop.store.store.domain.security.Role;

public interface RoleRepository extends CrudRepository<Role, Long> {
	
	Role findByName(String name);

}
