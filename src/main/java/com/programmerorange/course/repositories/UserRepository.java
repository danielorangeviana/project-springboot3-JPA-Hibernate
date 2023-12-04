package com.programmerorange.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.programmerorange.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{
}
