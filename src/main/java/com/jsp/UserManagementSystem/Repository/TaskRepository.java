package com.jsp.UserManagementSystem.Repository;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.jsp.UserManagementSystem.Entity.Task;

public interface TaskRepository extends JpaRepository<Task, Integer> {
	@Modifying
	@Transactional
	@Query("UPDATE Task u SET u.title=:ti,u.descripttion=:des,u.duedate=:due,u.assignedto=:ast,u.status=:st WHERE u.id=:i ")
     void upt(@Param("ti") String title,@Param("des") String dec,@Param("due") String due,@Param("ast") String ast,@Param("st") String st,@Param("i") int id);
	List<Task> findByTitle(String tname);
	List<Task> findByDescripttion(String des);
	List<Task> findByAssignedto(String ass);
	
}
