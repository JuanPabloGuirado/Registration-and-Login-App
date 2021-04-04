package com.JuanP.spingboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.JuanP.spingboot.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
