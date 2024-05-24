package com.gdam.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gdam.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
