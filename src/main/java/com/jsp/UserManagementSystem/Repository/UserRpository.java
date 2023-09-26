package com.jsp.UserManagementSystem.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.jsp.UserManagementSystem.Entity.UserEntity;

public interface UserRpository extends JpaRepository<UserEntity, Integer> {
@Query("SELECT c from UserEntity c WHERE c.name=:name AND c.password=:password")
UserEntity getUserObject(@Param("name")String name, @Param("password") String password);
}
