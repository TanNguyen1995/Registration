package com.example.codejava;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepository extends JpaRepository<user, String> {
	@Query("SELECT u FROM user u Where u.ID = ?1")
	user findByID(String ID); 
}
