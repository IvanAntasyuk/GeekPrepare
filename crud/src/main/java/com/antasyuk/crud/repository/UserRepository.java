package com.antasyuk.crud.repository;

import com.antasyuk.crud.persist.User;
import org.springframework.data.jpa.repository.JpaRepository;



public interface UserRepository  extends JpaRepository<User, Long> {
}
